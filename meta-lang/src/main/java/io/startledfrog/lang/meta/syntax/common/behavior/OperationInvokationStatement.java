package io.startledfrog.lang.meta.syntax.common.behavior;

import java.util.ArrayList;
import java.util.List;

import io.startledfrog.lang.meta.syntax.common.structure.Operation;
import io.startledfrog.lang.meta.syntax.common.structure.Parameter;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OperationInvokationStatement implements Statement {

    private Operation operation;
    private List<ParameterMapping> parametersMapping;

    @Override
    public boolean isValid() {
        if (!parametersMapping.stream().allMatch(ParameterMapping::isValid)
                || operation.getOwnedParameters().size() != parametersMapping.size()) {
            return false;
        }
        ArrayList<Parameter> parametersToFind = new ArrayList<>(operation.getOwnedParameters());
        return parametersMapping.stream()
                .map(ParameterMapping::getParameter)
                .map(parametersToFind::remove)
                .allMatch(Boolean.TRUE::equals);
    }
}

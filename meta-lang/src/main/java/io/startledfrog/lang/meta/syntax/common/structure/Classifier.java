package io.startledfrog.lang.meta.syntax.common.structure;

/**
 * Named after <a href="https://github.com/ModelDriven/fUML-Reference-Implementation/blob/9f140d2a9f40aabde6fc7bb185c3886707e5e6d5/org.modeldriven.fuml/src/main/java/fuml/syntax/classification/Classifier.java#L19">
 *   FUML Classifier
 * </a>
 * 
 * Contains features
 */
public abstract class Classifier extends Type {
    
    public abstract Iterable<? extends Feature> getFeatures();
}

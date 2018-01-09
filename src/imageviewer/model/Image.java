package imageviewer.model;

/**
 * @author Michael Bueno
 */
public interface Image {
    
    byte[] bitmap();

    Image next();
    Image prev();
    
}

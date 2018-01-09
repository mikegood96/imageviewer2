package imageviewer.ui;

import imageviewer.model.Image;

/**
 * @author Michael Bueno
 */
public interface ImageDisplay {
    
    Image currentImage();
    void display(Image image); 
    
}

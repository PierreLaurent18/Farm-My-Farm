package Controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SpriteManager {

    public static final Image TERRE           = load("/image/Terre.png");
    public static final Image GRAINE_BLE      = load("/image/GraineBlé.png");
    public static final Image BLE_POUSSE      = load("/image/Blé2.png");
    public static final Image BLE_MATURE      = load("/image/Blé3.png");
    public static final Image BLE_RECOLTE     = load("/image/BléImage.png");
    public static final Image GRAINE_CAROTTE  = load("/image/GraineCarotte.png");
    public static final Image CAROTTE_POUSSE  = load("/image/Carotte2.png");
    public static final Image CAROTTE_MATURE  = load("/image/Carotte3.png");
    public static final Image CAROTTE_RECOLTE = load("/image/CarotteImage.png");

    private static Image load(String path) {
        try {
            return new Image(SpriteManager.class.getResourceAsStream(path));
        } catch (Exception e) {
            System.err.println("Sprite introuvable : " + path);
            return null;
        }
    }

    public static ImageView makeView(Image img) {
        ImageView iv = new ImageView(img);
        iv.setFitWidth(56);
        iv.setFitHeight(56);
        iv.setPreserveRatio(true);
        iv.setSmooth(false); // Garde le rendu pixel-art net
        return iv;
    }
}
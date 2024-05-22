import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld() {    
        super(800, 800, 1); // Tamaño del mundo (ancho, alto, tamaño de celda)
        setBackgroundImageCentered("fondo.jpeg");
        prepare();
    }

    private void setBackgroundImageCentered(String filename) {
        // Cargar la imagen de fondo
        GreenfootImage backgroundImage = new GreenfootImage(filename);

        int worldWidth = getWidth();
        int worldHeight = getHeight();
        int imageWidth = backgroundImage.getWidth();
        int imageHeight = backgroundImage.getHeight();

        // Crear una nueva imagen del tamaño del mundo
        GreenfootImage worldImage = new GreenfootImage(worldWidth, worldHeight);

        // Calcular el recorte necesario para centrar la imagen
        int xOffset = (imageWidth - worldWidth) / 2;
        int yOffset = (imageHeight - worldHeight) / 2;

        // Dibujar solo la parte visible de la imagen en el centro del mundo
        worldImage.drawImage(backgroundImage, -xOffset, -yOffset);

        // Establecer la nueva imagen como fondo del mundo
        setBackground(worldImage);
    }
        
    private void prepare() {
        // Crear y agregar el jugador al mundo
        red player = new red();
        addObject(player, 100, 200);

        // Crear y agregar plataformas al mundo
        platform platform1 = new platform();
        addObject(platform1, 300, 300);

        platform platform2 = new platform();
        addObject(platform2, 500, 20);
        
        platform platform3 = new platform();
        addObject(platform3,75,432);
        platform platform4 = new platform();
        addObject(platform4,120,502);
        platform platform5 = new platform();
        addObject(platform5,153,502);
        platform platform6 = new platform();
        addObject(platform6,182,502);
        platform platform7 = new platform();
        addObject(platform7,206,502);
        platform platform8 = new platform();
        addObject(platform8,225,500);
        platform platform9 = new platform();
        addObject(platform9,240,500);
        platform platform10 = new platform();
        addObject(platform10,260,502);
        platform platform11 = new platform();
        addObject(platform11,39,576);
        platform platform12 = new platform();
        addObject(platform12,64,576);
        platform12.setLocation(73,576);
        platform platform13 = new platform();
        addObject(platform13,73,576);
        platform platform14 = new platform();
        addObject(platform14,88,576);
        platform platform15 = new platform();
        addObject(platform15,104,576);
        platform platform16 = new platform();
        addObject(platform16,130,576);
        platform platform17 = new platform();
        addObject(platform17,164,576);
        platform platform18 = new platform();
        addObject(platform18,186,731);
        platform platform19 = new platform();
        addObject(platform19,232,736);
        platform platform20 = new platform();
        addObject(platform20,282,736);
        platform platform21 = new platform();
        addObject(platform21,321,782);
        platform platform22 = new platform();
        addObject(platform22,416,781);
        platform platform23 = new platform();
        addObject(platform23,348,780);
        platform platform24 = new platform();
        addObject(platform24,366,780);
        platform platform25 = new platform();
        addObject(platform25,439,785);
        platform platform26 = new platform();
        addObject(platform26,488,784);
        platform platform27 = new platform();
        addObject(platform27,537,782);
        platform platform28 = new platform();
        addObject(platform28,556,782);
        platform platform29 = new platform();
        addObject(platform29,584,782);
        platform platform30 = new platform();
        addObject(platform30,610,782);
        platform30.setLocation(621,782);
        platform platform31 = new platform();
        addObject(platform31,621,782);
        platform platform32 = new platform();
        addObject(platform32,655,782);
        platform platform33 = new platform();
        addObject(platform33,682,656);
        platform33.setLocation(692,657);
        platform platform34 = new platform();
        addObject(platform34,692,657);
        platform34.setLocation(704,657);
        platform platform35 = new platform();
        addObject(platform35,704,657);
        platform platform36 = new platform();
        addObject(platform36,727,655);
        platform36.setLocation(739,657);
        platform platform37 = new platform();
        addObject(platform37,739,657);
        platform platform38 = new platform();
        addObject(platform38,754,658);
        platform platform39 = new platform();
        addObject(platform39,785,658);
        platform platform40 = new platform();
        addObject(platform40,625,566);
        platform platform41 = new platform();
        addObject(platform41,652,566);
        platform41.setLocation(656,566);
        platform platform42 = new platform();
        addObject(platform42,656,566);
        platform41.setLocation(661,566);
        platform platform43 = new platform();
        addObject(platform43,661,566);
        platform platform44 = new platform();
        addObject(platform44,681,566);
        platform44.setLocation(681,566);
    }
}

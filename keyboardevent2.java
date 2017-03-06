import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.canvas.*;
import javafx.event.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;



public class keyboardevent2 extends Application {
  private int n = 0;
  int x=175;
int channel = 1;

  Canvas canvas = new Canvas(400, 300);
Image bg = new Image("road.jpeg");
  GraphicsContext g = canvas.getGraphicsContext2D();

  public void start (Stage stage) {
    Group root = new Group(canvas);
    Scene road = new Scene(root);
    stage.setScene(road);
    draw(g, x, bg);
    stage.show();
    road.setOnKeyPressed(this::handle);
  }

  private void draw(GraphicsContext g, int x, Image bg) {
g.drawImage(bg, 0, 0);
    g.fillOval(x, 175, 50, 50);
  }



  public void handle(KeyEvent event) {
    if(event.getCode() == KeyCode.RIGHT) {
      System.out.println("RIGHT");
     
if (channel < 4){
channel +=1;
 x+=50;

      draw(g, x, bg);
}
    }
    else if(event.getCode() == KeyCode.LEFT) {
      System.out.println("LEFT");
if (channel >0){
channel -=1;
      x-=50;

      draw(g, x, bg);
}
    }
  }
}

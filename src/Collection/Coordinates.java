package Collection;

import Exception.IcorrectFieldException;

import java.io.Serializable;

/**
 * Класс для установки координат
 */


public class Coordinates implements Serializable {

    public Double x;
    public Long y;
    private static final long serialVersionUID = 18L;

   public Coordinates(Double x, Long y) {
       if (x != null) {
           this.x = x;
       } else {
           throw new IcorrectFieldException("Incorrect input X");
       }
       if (y != null) {
           this.y = y;
       } else {
           throw new IcorrectFieldException("Incorrect input Y");
       }
    }

    public Double getX() {
        return x;
    }

    public Long getY() {
        return y;
    }



 //   private void checkY() {
   //     if (y == null) {
     //       throw new IcorrectFieldException("Incorrect input: y");
      //  }
    //}

    @Override
    public String toString() {
        return "x:" + x +
                ", y:" + y;
    }
}
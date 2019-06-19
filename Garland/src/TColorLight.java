public class TColorLight extends TLight {

    private String FColor;

    TColorLight(String F){
        super("On");
        FColor = F;
    }

    TColorLight(){
        super("Off");
    }

    public String GetColor() {
        return FColor;
    }
}

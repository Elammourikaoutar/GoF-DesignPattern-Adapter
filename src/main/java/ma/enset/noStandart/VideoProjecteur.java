package ma.enset.noStandart;

public class VideoProjecteur implements VGA {

    @Override
    public void view(byte[] data) {
        String str=new String(data);
        System.out.println("---------"+this.getClass().getSimpleName()+"----------");
        System.out.println(str.toUpperCase());
        System.out.println("-------------");

    }
}

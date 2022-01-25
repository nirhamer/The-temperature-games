public class DtoStage2 {
    String data;


    public DtoStage2(String data){
        this.data = data;
    }

    public String getData() { return data; }


    public DtoStage2 setData(String data){
        this.data = data;
        return this;
    }

    @Override
    public String toString(){
        return "Dto2Stage{" +
                "data='" + data + '\'' +
                '}';
    }
}

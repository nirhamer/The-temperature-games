public class DtoStage1 {
    int data;


    public DtoStage1(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public DtoStage1 setData(int data){
        this.data = data;
        return this;
    }


    @Override
    public String toString(){
        return "Dto1Stage{" +
                "data" + data +
                '}';
    }
}

import java.util.Random;

public class MagicBox<T>  {
    private T[] items;

    public MagicBox(int arrayLeigth ){
        this.items =(T[]) new Object[arrayLeigth];
    }

    public boolean add(T item){
        for(int i =0; i<items.length; i++ ) {
            if (items[i] == null){
                items[i] = item;
                System.out.println(item + " Добавлено!");
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public  <T> T pick(){
        for(int i =0; i<items.length; i++ ) {
            if (items[i] == null) {
                throw new RuntimeException("В коробке осталось еще " + (items.length - i) + " ячеек для заполнения!");
            } else {
                continue;
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return (T) items[randomInt];
    }


}

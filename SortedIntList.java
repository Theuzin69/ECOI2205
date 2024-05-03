// ****************************************************************
// SortedIntList.java
//
// A sorted integer list class with a method to add an
// integer to the list and a toString method that returns the contents
// of the list with indices.
//
// ****************************************************************
public class SortedIntList extends IntList {
    public SortedIntList(int size){
        super(size);
    }
    public void add(int value){
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else if (numElements == 0)
        {
            list[numElements] = value;
            numElements++;
        }
        else if(list[numElements-1]<value){
            list[numElements] = value;
            numElements++;
        }
        else{
            int index = 0;
            while(index<numElements){
                if (value<list[index]){
                    for(int j=numElements;j>index;j--){
                        list[j]=list[j-1];
                    }
                    list[index] = value;
                    numElements++;
                    index=numElements;
                } else
                    index++;
            }
        }
    }
}

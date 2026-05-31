package Heap;

class heap{
    private int[] heaparr;
    private int capacity;
    private int currsize;
    public heap(int n){ //Constructor
        capacity=n;
        heaparr=new int[capacity];
        currsize=0;
    }
    private void swap(int[] arr,int a,int b){ //swapping using reference
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    private int parent(int index){ //Returns parent index for the given index
        return (index-1)/2;
    }
    private int left(int index){ //Return left child of current index
        return 2*index+1;
    }
    private int right(int index){ //Return right child of current index
        return 2*index+2;
    }
    public boolean insertKey(int key){ //Insert a new Key
         if(currsize==capacity) return false;
         int i=currsize; //Here we insert the new key at the end
         heaparr[i]=key;
         currsize++;
         while(i!=0 && heaparr[i]<heaparr[parent(i)]){ //Fix the min heap property if it's being violated
             swap(heaparr,i,parent(i));
             i=parent(i);
         }
         return true;
    }
}

public class Implementation {
    public static void main(String[] args) {

    }
}

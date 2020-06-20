package youngri.sort;

public class MergeSort {
    void merge(int data[], int p, int q, int r){
        int i=p, j=q+1, k=p; // 시작, 중간, 합친 시작
        int[] tmp = new int[data.length];
        while(i<=q && j <= r){
            if(data[i] <= data[j])
                tmp[k++] = data[i++];
            else
                tmp[k++] = data[j++];
        }
        while (i <= q)
            tmp[k++] = data[i++];
        while (j <= r)
            tmp[k++] = data[j++];
        for(i = p; i <= r; i++){
            data[i] = tmp[i];
        }
    }
}

package _09_Template;

/**
 * 简单实现了一个模板方法，具体的实际代码可以参考 Java 集合的 sort 方法。也可以 google 分析的文章哦
 * 
 * @author niushuai
 *
 */
public class Demo {

    public static void main(String[] args) {
        SortTemplate bsort = new BubbleSort();
        bsort.sort();

        System.out.println();

        SortTemplate qsort = new QuickSort();
        qsort.sort();

        System.out.println();

        SortTemplate msort = new MergeSort();
        msort.sort();
    }

}

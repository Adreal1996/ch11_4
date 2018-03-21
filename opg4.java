package ch11;

/* Write a method called partition that accepts a list of integers and an integer value E as its parameter,
 and rearranges (partitions) the list so that all the elements with values less than E occur before all
 elements with values greater than E. The exact order of the elements is unimportant,
 so long as all elements less than E appear before all elements greater than
E. For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9],
one acceptable ordering of the list after a call of partition(list, 5) would be
[–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9]. You may assume that the list contains no
duplicates and does not contain the element value E. */

import java.util.LinkedList;

public class opg4
{
    public static void main(String[] args)
    {
        LinkedList<Integer> liste1 = new LinkedList<>();
        liste1.add(2);
        liste1.add(4);
        liste1.add(1);
        liste1.add(8);
        liste1.add(9);
        liste1.add(3);
        liste1.add(5);
        liste1.add(7);

        System.out.println(partitions(liste1, 6));
    }

    public static LinkedList<Integer> partitions(LinkedList<Integer> partitions1, int E)
    {
        LinkedList<Integer> belowE = new LinkedList<>();
        LinkedList<Integer> aboveE = new LinkedList<>();

        int c = 0;

        while (partitions1.size() > c)
        {
            if (partitions1.get(c) < E)
            {
                belowE.add(partitions1.get(c));
                c++;
            }
            else
                {
                    aboveE.add(partitions1.get(c));
                    c++;
                }
        }

        belowE.addAll(aboveE);
        return belowE;
    }

}

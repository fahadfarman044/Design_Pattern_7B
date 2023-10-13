/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF_Iterator;

/**
 *
 * @author fa20-bse-044
 */
public class NameRepository implements Container {
    public Student students[] = {
        new Student(1, "Faizan", "Male", "0311-0000888"),
        new Student(2, "hashir", "Male", "0311-1213131"),
        new Student(3, "Ehsan", "Male ", "0311-00030303"),
        new Student(4, "Zain", "Male", "0311-19999933"),
        new Student(5, "Asim", "Male", "0321-1111112"),
        new Student(6, "Hamza", "Male", "0321-2111112"),
        new Student(7, "Adan", "Male", "0321-1411112"),
        new Student(8, "shah", "Male ", "0321-1121112"),
        new Student(9, "quaid ", "Male", "0321-1123112"),
    };

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < students.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index++];
            }
            return null;
        }

        public boolean hasPrevious() {
            return index > 0;
        }

        public Object previous() {
            if (this.hasPrevious()) {
                return students[--index];
            }
            return null;
        }

        public void moveToLast() {
            index = students.length - 1;
        }

        public void moveToFirst() {
            index = 0;
        }
    }
}

public class Num5Main {

    public static Queue findOneGenreBooks(Queue Q, String genreType) {
        Queue result = new Queue();
        Queue clone;

        try {
            clone = (Queue) Q.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new Queue();
        }

        while (!clone.isEmpty()) {
            if (clone.front().getGenre().equals(genreType)) {
                result.enqueue(clone.dequeue());
            } else {
                clone.dequeue();
            }
        }

        return result;
    }
}

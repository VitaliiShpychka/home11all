package home5;
import java.util.stream.Stream;
public class StreamZip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        var firstIterator = first.iterator();
        var secondIterator = second.iterator();

        Stream<T> tStream = (Stream<T>) Stream
                .iterate(null, ignored -> {
                    if (firstIterator.hasNext() && secondIterator.hasNext()) {
                        return firstIterator.next();
                    } else {
                        return null;
                    }
                })
                .takeWhile(element -> element != null)
                .flatMap(element -> Stream.of(element, secondIterator.next()));
        return tStream;
                
    }
}

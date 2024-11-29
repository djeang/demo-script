package utils;

import com.github.lalyos.jfiglet.FigletFont;
import com.google.common.base.Strings;

import java.io.IOException;
import java.io.UncheckedIOException;

public record PowerText(String text) {

    public String asciiart() {
        try {
            return FigletFont.convertOneLine(text);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String repeat(int count) {
        return Strings.repeat(text + " ", count);
    }

}
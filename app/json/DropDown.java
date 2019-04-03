package json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class DropDown
{
    public final boolean success;
    public final String replacement;
    public final Menu menu[];

    @JsonCreator
    public DropDown(@JsonProperty("success") boolean success, @JsonProperty("replacement") String replacement, @JsonProperty("menu") Menu[] menu)
    {
        this.success = success;
        this.replacement = replacement;
        this.menu = menu;
    }

    public static final class Menu
    {
        public final String name;
        public final int value;

        @JsonCreator
        public Menu(@JsonProperty("name") String name, @JsonProperty("value") int value)
        {
            this.name = name;
            this.value = value;
        }
    }
}
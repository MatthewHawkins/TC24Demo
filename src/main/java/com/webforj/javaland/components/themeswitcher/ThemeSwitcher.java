package com.webforj.javaland.components.themeswitcher;


import com.webforj.annotation.Attribute;
import com.webforj.annotation.InlineJavaScript;
import com.webforj.component.element.ElementComposite;
import com.webforj.component.element.annotation.NodeName;

@NodeName("theme-switcher")
@InlineJavaScript(id = "theme-switcher", value = "context://public/components/themeswitcher/theme-switcher.js", attributes = {
    @Attribute(name = "type", value = "module")
})
public final class ThemeSwitcher extends ElementComposite {
}

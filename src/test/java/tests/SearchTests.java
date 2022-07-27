package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Story("Mobile UI Testing")
@Owner("allure8")

public class SearchTests extends TestBase {

    @Test
    @Tags({@Tag("Search"), @Tag("Mobile")})
    @DisplayName("Check search is finding item")
    void searchTest() {
        step("Skip onboarding screen", () ->
                back());

        step("Type on search field", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container"))
                    .click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .sendKeys("BrowserStack");
        });

        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(CollectionCondition.sizeGreaterThan(0)));
    }

    @Test
    @Tags({@Tag("Search"), @Tag("Mobile")})
    @DisplayName("Check search is finding correct item")
    void searchTestMozartCheckByText() {
        step("Skip onboarding screen", () ->
                back());

        step("Type on search field", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container"))
                    .click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .sendKeys("Mozart");
        });

        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(CollectionCondition.containExactTextsCaseSensitive("Wolfgang Amadeus Mozart")));
    }

    @Test
    @Tags({@Tag("Other"), @Tag("Mobile")})
    @DisplayName("Check opening screen onboarding pages")
    void openingScreenTest() {
        step("Check first page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("The Free Encyclopedia\n" +
                            "…in over 300 languages"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                    .click();
        });

        step("Check second page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("New ways to explore"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                    .click();
        });

        step("Check third page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("Reading lists with sync"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                    .click();
        });

        step("Check fourth page", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                        shouldHave(text("Send anonymous data")));
    }

    @Test
    @Tags({@Tag("MainPage"), @Tag("Mobile")})
    @DisplayName("Verify main page opened")
    void checkMainPageOpened() {
        step("Skip onboarding screen", () ->
                back());

        step("Verify content found", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text"))
                        .shouldHave(text("Customize your Explore feed ")));

        step("check main page picture is available", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/main_toolbar_wordmark"))
                        .shouldBe(visible));
    }

    @Test
    @Tags({@Tag("Bookmarks"), @Tag("Mobile")})
    @DisplayName("Check article can be added to bookmarks")
    void saveItem() {
        step("Skip onboarding screen", () ->
                back());

        step("Type on search field and open correct wiki page ", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .sendKeys("Mozart");
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
        });

        step("Add article into bookmarks", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/page_save")).click());

        step("Return to the main page", () -> {
            $(AppiumBy.className("android.widget.ImageButton")).click();
            $(AppiumBy.className("android.widget.ImageButton")).click();
        });

        step("Open bookmarks page", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click());

        step("Check article was added", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/item_title")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                    .shouldHave(text("Wolfgang Amadeus Mozart"));
        });
    }
}
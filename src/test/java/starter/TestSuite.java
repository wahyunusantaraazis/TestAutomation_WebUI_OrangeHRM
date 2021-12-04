package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/account",
        tags = "@Login"
)
public class TestSuite {

}

//Cara mengatasi report serenity tidak bisa diclick
//folder subfolder fitur direname "features" jangan "feature"
//hal ini bisa membuat reportnya menjadi lengkap 4 menu bukan 2 menu

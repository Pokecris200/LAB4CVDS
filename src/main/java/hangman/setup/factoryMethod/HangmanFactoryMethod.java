package hangman.setup.factoryMethod;

import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import static com.google.inject.Guice.createInjector;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;

abstract public class HangmanFactoryMethod extends AbstractModule{
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
    
    @Override
    protected void configure() {
    	
    	bind(GameScore.class).to(OriginalScore.class);
    }
}

package guru.springframework.sfgdi_09072020.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("i18nService")
@Profile("FR")
public class Profilei18nFrenchGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "----------------------------\n"
                +"Bonjour le monde! - FRENCH SERVICE\n"
                +"----------------------------\n";
    }
}

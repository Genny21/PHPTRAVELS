package setup.enviroment;

import com.prac.phptravels.constans.Constants;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class TestEnvironments {

    private final EnvironmentVariables environmentVariables;

    public TestEnvironments(EnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public String getBaseUrl() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constants.BASE_URL);
    }

    public String getPathVuelo() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constants.PATH_PHP_VUELOS);
    }

    public String getPathAeropueto() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constants.PATH_PHP_AEROPUERTOS);
    }

    public String getPathAerolinea() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constants.PATH_PHP_AEROLINEAS);
    }
}

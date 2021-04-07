package onliner;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Credencials {

    String login;
    String password;
}

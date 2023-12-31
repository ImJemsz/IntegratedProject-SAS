package int221.nw2.project.yuuuhooo.dtos;

import int221.nw2.project.yuuuhooo.validations.Unique;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDTO {
    @Unique(field = "username")
    @NotBlank
    @Size(min = 1, max = 45)
    private String username ;
    @NotBlank
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,14}$",
            message = "must be 8-14 characters long, at least 1 of uppercase, lowercase, number and special characters")
    private String password ;
    @Unique(field = "name")
    @NotBlank
    @Size(min = 1, max = 100)
    private String name ;
    @Unique(field = "email")
    @NotBlank
    @Email(message = "Email should be valid")
    @Size(min = 1, max = 150)
    private String email ;
    @NotBlank
    private String role ;

}
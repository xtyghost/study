package beancopy.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author xutong
 */
@Data
public class PersonDTO {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private Date birth;
    private String birthDateFormat;
    private String birthExpressionFormat;

}

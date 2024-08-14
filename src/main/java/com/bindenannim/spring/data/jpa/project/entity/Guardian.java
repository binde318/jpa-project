package com.bindenannim.spring.data.jpa.project.entity;

import jakarta.persistence.*;
import lombok.*;
@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name ="name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "guardian_phone")
        )

})
public class Guardian {
    private String name;
    private String email;
    private String mobile;
}

package com.example.Hotel_mngmt.model.Request;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;
@Data
public class RequestUser implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private String role;
}

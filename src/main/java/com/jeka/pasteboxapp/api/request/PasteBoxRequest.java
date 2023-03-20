package com.jeka.pasteboxapp.api.request;

import lombok.Data;

@Data
public class PasteBoxRequest {
    private String Data;
    private long exrirationTimeSeconds;
    private PublicStatus publicStatus;
}

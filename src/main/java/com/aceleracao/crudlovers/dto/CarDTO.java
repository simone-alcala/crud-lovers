package com.aceleracao.crudlovers.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CarDTO(

  @NotBlank
  String modelo,

  @NotBlank
  String fabricante,

  @NotNull
  Date dataFabricacao,

  @NotNull
  @Positive
  Double valor,

  @Positive
  @NotNull
  Integer anoModelo) {
  
}

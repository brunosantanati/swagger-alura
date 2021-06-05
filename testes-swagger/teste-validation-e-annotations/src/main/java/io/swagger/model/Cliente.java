package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class Cliente {
  @JsonProperty("id")
  @ApiModelProperty(example = "234", value = "")
  private Long id = null;

  @JsonProperty("titular")
  @ApiModelProperty(example = "Janete S. Silva", value = "")
  @NotNull
  private String titular = null;

  @JsonProperty("cpf")
  @ApiModelProperty(example = "01234567899", value = "")
  @Size(min=11,max=11)
  private String cpf = null;

  @JsonProperty("senha")
  @ApiModelProperty(example = "senha1234", value = "")
  private String senha = null;

  @JsonProperty("contas")
  @ApiModelProperty(value = "")
  @Valid
  private List<Conta> contas = null;
}


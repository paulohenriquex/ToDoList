package br.phsx.todoList.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class TarefaDTO {

    @NotBlank(message = "A descricao não pode estar em branco.")
    private String descricao;
    @NotNull(message = "A data de prazo não pode ser nula.")
    @FutureOrPresent(message = "A data do prazo não pode ser no passado.")
    private LocalDate dataPrazo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }
}

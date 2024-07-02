package desafioPooDio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{
    private int CargaHorario;

    @Override
    public double calcularXp() {
        return XP_PADRAO * CargaHorario;
    }

    public Curso() {
    }

    public int getCargaHorario() {
        return CargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        CargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", CargaHorario=" + CargaHorario +
                '}';
    }
}

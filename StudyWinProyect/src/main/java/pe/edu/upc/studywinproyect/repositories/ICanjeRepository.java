package pe.edu.upc.studywinproyect.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.studywinproyect.entities.Canje;
import java.time.LocalDate;
import java.util.List;

public interface ICanjeRepository extends JpaRepository<Canje, Integer> {
    public List<Canje> findByPurchaseDateDevice(LocalDate fecha);
    //Como usuario quiero buscar por departamento a los canjes para gestionarlos
    @Query("SELECT c FROM Canje c WHERE c.departamento LIKE %:departamento%")
    List<Canje> buscarDepartamento(String departamento);
}

package tallerpablobel;

import java.util.List;

public interface iAccesoDatos {
    public void insertar();
    public List<Coche> select();
    public void delete();
    public void update();
    
}

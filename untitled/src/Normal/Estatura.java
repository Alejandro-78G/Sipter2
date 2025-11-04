package Normal;

public class Estatura {
    int [] estaatura;
    int altos;
    int bajos=18888888;

    public void Estableceralturas(int [] estaatura){
        this.estaatura=estaatura;
    }

    public void calcualarEstaturas(){
        for (int i = 0;i<estaatura.length;i++){
            if (altos<estaatura[i]){
                altos=estaatura[i];
            } else if (bajos>estaatura.length){
                bajos=estaatura[i];
            }
        }
        }
        public int Masalto(){return altos;}
        public int Masbajo(){return bajos;}
    }


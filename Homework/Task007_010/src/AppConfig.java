import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * Created by Julia_2 on 24.03.2016.
 */
@Component
public class AppConfig {
    @Bean(name = "bigEagle")
    public Eagle bigEagle(){
        return new Eagle("Клювокрыл",1000);
    }
    @Bean(name = "smallEagle")
    public Eagle smallEagle(){
        return new Eagle("Eagle",500);
    }
    @Bean(name = "eagle")
    public  Eagle eagle(){
        return new Eagle("Gwaihir",700);
    }
    @Bean(name = "drowElf")
    public DrowElf drowElf(){
        return new DrowElf("Aragorn",5000,bigEagle(),2000);
    }
    @Bean(name = "lightElf")
    public LightElf lightElf(){
        return new LightElf("Valar",5000,smallEagle(),1000);
    }
    @Bean(name = "human")
    public Human human(){
        return new Human("Tolkin",400);
    }
    @Bean(name = "weapon")
    public Weapon weapon(){
        return new Weapon("Sword",100);
    }
    @Bean(name = "dwarf")
    public Dwarf dwarf(){
        return new Dwarf(500,"Balin",1540,weapon());
    }
    @Bean(name = "halfBreed")
    public HalfBreed halfBreed(){
        return new HalfBreed("Hermione",600);
    }

    @Bean(name = "orc")
    public Orc orc(){
        return  new Orc("Shrek",50,200,"green");
    }
    @Bean(name = "potion")
    public Potion potion(){
        return new Potion();
    }
    @Bean(name = "elf")
    public Elf elf(){
        return new LightElf("Galadriel",6000,eagle(),1500);
    }
}

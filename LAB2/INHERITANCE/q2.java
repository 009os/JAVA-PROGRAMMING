
class Player {
    void name() {
        System.out.println("name of player");
    }
}

class cric_player extends Player {
    void namec() {
        System.out.println("virat");
    }
}

class Foot_player extends Player {
    void namef() {
        System.out.println("zlatan");
    }
}

class Hock_player extends Player {
    void nameh() {
        System.out.println("dhyan chand");
    }
}

class q2 {
    public static void main(String args[]) {
        Hock_player d = new Hock_player();
        d.name();
        d.nameh();
       
       
    }
}
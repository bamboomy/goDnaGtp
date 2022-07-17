package genetic;
import java.util.ArrayList;
class Thought50 extends Thought{
private static ArrayList<Thought50> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 637.8830777524123;
private double fd1 = 234.13542118545578;
private Thought fo0 = null;
private Thought fo1 = null;
Thought50 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought50 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought50 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought50 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought50 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
    Output.points[6][3] += fd1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][4] += fd1;
    Thought lo2 = Thought39.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(lb1, lb3, fb0, fb1);
}
        Thought lo4 = Thought390.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
        boolean lb5 = true;
        fd0 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          lb0 = fo1.m2(fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(fo0 != null){
          lb5 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb3, fb0);
}
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 *= -1;
        boolean lb6 = false;
        lb5 = lb6 && lb0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    Output.points[6][5] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 41.242484887411734;
    ab4 = fb0 && fb1;
    ab1 = fd0 > fd1;
    Output.points[6][6] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        if (fb0) {
if(fo0 != null){
              fd1 = fo0.m3();
}
            } else {
            ld0 *= -1;
            boolean lb1 = false;
            for(int i0=0; i0<10; i0++){
if(fo1 != null){
                  fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
                fd1 = ld0 + fd0;
                Output.points[6][7] -= fd1;
                ld0 *= -1;
                Output.points[6][8] -= fd0;
                ab2 = !ab3;
if(fo0 != null){
                  fo0.m1(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
                  fo1.m3(fo0, fo1, fo0, fo1);
}
}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb2 = true;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Output.points[7][0] += ad1;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
    lb2 = fd0 < fd1;
if(fo0 != null){
      lb3 = fo0.m2(fb0, fb1, lb0, lb1);
}
    lb2 = lb3 || fb0;
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld4 = 737.5712248026955;
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    ld4 = ad1 + ad2;
    ad3 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    Thought lo1 = Thought4.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
    double ld2 = 804.417158983839;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    double ld3 = 131.96550615029744;
    Output.points[7][1] += ad4;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld0 = 547.2218154243562;
    ld0 = fd0 - fd1;
    boolean lb1 = false;
    Output.points[7][2] -= ld0;
    Thought lo2 = Thought50.getInstance(fd0, fd1, ld0, fd0);
    fd1 *= -1;
    lb1 = !fb0;
    fb1 = ld0 > fd0;
    boolean lb3 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, lb1, lb3, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought197.getInstance();
    double ld5 = 544.8801531899614;
    boolean lb6 = false;
    lb1 = fd0 > fd1;
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld5, fd0, fd1, ld0, lb3, lb6, fb0, fb1);
}
if(ao3 != null){
      ld5 = ao3.m3(lb1, lb3, lb6, fb0);
}
    double ld7 = 228.5611050474693;
    Thought lo8 = Thought17.getInstance(ao4, fo0, fo1, ao1);
    ld7 *= -1;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, ld5);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld7, fd0, fd1, ld0);
}
    Thought lo9 = Thought69.getInstance(ld5, ld7, fd0, fd1, fb1, lb1, lb3, lb6);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        double ld0 = 573.7698608417435;
        fb0 = ad4 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
        double ld1 = 403.4840002880721;
        double ld2 = 87.28256927397089;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
        Thought lo3 = Thought241.getInstance(ad4, fd0, fd1, ld0);
        boolean lb4 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld2, ad1, ad2);
}
        double ld5 = 350.93203021782557;
if(ao3 != null){
          ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb4, fb0);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fb1, lb4, fb0, fb1);
}
if(ao3 != null){
          ao3.m1();
}
        }
    double ld6 = 278.84040273510743;
    Thought lo7 = Thought20.getInstance(ao4, fo0, fo1, ao1, ld6, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = ad4 < fd0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld6;
    ad1 = ad2 + ad3;
    boolean lb8 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[7][3] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    Output.points[7][4] -= fd0;
    ab4 = fd1 < fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1();
}
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    Thought lo1 = Thought159.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    lb0 = fd1 < ad1;
    Thought lo2 = Thought18.getInstance(ab1, ab2, ab3, ab4);
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab4 = fb0 && fb1;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    lb0 = !lb3;
    double ld5 = 428.6542444767004;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld5, ad1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao2 != null){
      lb4 = ao2.m2(fd1, ld5, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo6 = Thought57.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb3);
    boolean lb7 = true;
    lb4 = ad3 < ad4;
    fd0 = fd1 - ld5;
    lb7 = !ab1;
    ad1 = ad2 + ad3;
    boolean lb8 = false;
if(ao1 != null){
      ao1.m1();
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld5, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo9 = Thought43.getInstance(fb0, fb1, lb0, lb3);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought269.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = !fb0;
    Thought lo2 = Thought306.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
    double ld3 = 152.196204350252;
    for(int i0=0; i0<10; i0++){
        lb1 = fd0 < fd1;
        for(int i1=0; i1<10; i1++){
            ld3 = fd0 + fd1;
            ld3 = fd0 - fd1;
            ld3 = fd0 + fd1;
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb1, fb0);
}
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 *= -1;
    Output.points[7][5] += fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = lb0 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought328.getInstance();

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    Output.points[7][6] += ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, lb0, fb0);
}
        double ld1 = 578.0894498099874;
    boolean lb2 = false;
    double ld3 = 510.7691800550805;
    fb0 = ld3 < ad1;
    ad2 = ad3 + ad4;
    fb1 = lb0 || lb2;
    Thought lo4 = Thought31.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][7] -= ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    ab2 = ab3 && ab4;
    ad4 = fd0 - fd1;
    Output.points[7][8] -= ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought139.getInstance();
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Output.points[8][0] -= ad3;
    ab1 = ab2 || ab3;
    double ld1 = 632.5837170790046;
if(fo1 != null){
      ad3 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    ab2 = ld1 < ad1;
    double ld2 = 485.7191985665115;
    Output.points[8][1] += ad1;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought299.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    double ld2 = 478.8958353613806;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought180.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld4 = 212.47389167953665;
    lb0 = ld2 > ld4;
    fb0 = !fb1;
    Thought lo5 = Thought322.getInstance(lb0, fb0, fb1, lb0);

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
    lb0 = ad2 > ad3;
    Output.points[8][2] += ad4;
    boolean lb1 = false;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb1 = ao1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb0;
    lb1 = fb0 && fb1;
    ad3 = ad4 - fd0;
    lb0 = lb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
        boolean lb2 = true;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + ad1;
    boolean lb3 = false;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    lb1 = !lb2;
    lb3 = !fb0;
    fb1 = ad2 > ad3;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    Thought lo1 = Thought341.getInstance(fd1, fd0, fd1, fd0);
    double ld2 = 133.53461943895297;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld2 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 < ld2;
if(ao3 != null){
      ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought391.getInstance(lb0, lb3, ab1, ab2);
    boolean lb5 = true;
    double ld6 = 440.37658398869496;
    double ld7 = 142.18921163219431;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    double ld3 = 926.9535368241267;
    fb1 = !lb0;
if(ao3 != null){
      lb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought40.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 43.172467875143326;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fd1 = ld1 + fd0;
    fb0 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    Output.points[8][3] += fd0;
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = fb0 || fb1;
    lb2 = fd1 < ld1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        Thought lo0 = Thought24.getInstance(ab4, fb0, fb1, ab1);
        Output.points[8][4] -= fd1;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        Thought lo2 = Thought197.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        double ld3 = 46.09158994842433;
if(fo1 != null){
          fo0 = fo1.m4(ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
        boolean lb4 = false;
        ab4 = !fb0;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    Output.points[8][5] -= ad2;
    Output.points[8][6] += ad3;
    Thought lo0 = Thought39.getInstance();
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    fb1 = !lb1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    Output.points[8][7] -= ad1;
    ad2 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    boolean lb0 = true;
    ab1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab2 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 *= -1;
    ab2 = !ab3;
    Thought lo2 = Thought332.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(lb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Output.points[8][8] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo0 = Thought334.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb1 = !fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fd0 = fd1 - ad1;
            ad2 *= -1;
            fb0 = ad3 < ad4;
            boolean lb1 = false;
            fb0 = fb1 || lb1;
            Thought lo2 = Thought381.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][0] -= fd1;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    Thought lo0 = Thought260.getInstance();
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    Thought lo1 = Thought184.getInstance(ao1, ao2, ao3, ao4);
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[0][1] -= fd1;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    double ld3 = 455.61927279085666;

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao2.m3();
}
    ab1 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 570.3138913181576;
if(ao3 != null){
          ao3.m1(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ab4 = ad1 > ad2;
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
        Output.points[0][2] -= ld0;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        lb1 = ld0 < ad1;
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought229.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Output.points[0][3] += fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    Thought lo2 = Thought331.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
    double ld3 = 716.9083433533367;
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb0, lb1, fb0, fb1);
}
    boolean lb4 = false;
    lb0 = !lb1;
    Thought lo5 = Thought126.getInstance(lb4, fb0, fb1, lb0);
    boolean lb6 = false;
    fd0 = fd1 - ld3;
    lb1 = lb4 || lb6;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    double ld0 = 565.9428103956474;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ld0;
    Thought lo1 = Thought281.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought89.getInstance(ab3, ab4, fb0, fb1);
    double ld3 = 396.0938614655553;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][4] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1);
}
    ld0 = ld3 + fd0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    ad1 *= -1;
    double ld1 = 215.28630779168208;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = ad1 < ad2;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
    double ld3 = 922.2111236841893;
    Output.points[0][5] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    Thought lo4 = Thought123.getInstance(fo0, fo1, fo0, fo1);
    ld3 *= -1;
    lb2 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[0][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld3, ad1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, lb0, lb2, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    double ld0 = 544.964527854804;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought8.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb2);
}
    double ld3 = 925.2913542059184;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    double ld5 = 935.7480440548649;
    double ld6 = 823.2908884010666;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 893.760051066375;
    boolean lb1 = true;
if(ao2 != null){
      ld0 = ao2.m3();
}
    fb0 = fd0 > fd1;
    Output.points[0][7] -= ld0;
    Thought lo2 = Thought264.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
    fd1 = ld0 - fd0;
    double ld3 = 118.98266170177045;
    Output.points[0][8] += fd0;
    Output.points[1][0] += fd1;
if(ao1 != null){
      lb1 = ao1.m2(fb0, fb1, lb1, fb0);
}
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fb0 = fd1 < ad1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        boolean lb0 = false;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = !fb1;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
        double ld1 = 951.3927624689277;
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd1 = ao2.m3(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 788.2130565458424;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    if (fb1) {
        double ld0 = 999.3589920640038;
        Thought lo1 = Thought124.getInstance();
        ad1 *= -1;
        ad2 = ad3 + ad4;
        fd0 *= -1;
        } else if (ab1) {
        ad1 = ad2 + ad3;
        boolean lb2 = true;
        double ld3 = 611.7188512168896;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          ao1.m2(fb1, lb2, ab1, ab2);
}
        Thought lo4 = Thought347.getInstance(ao2, ao3, ao4, fo0);
        if (ab3) {
            ab4 = fb0 && fb1;
            lb2 = ld3 < ad1;
            boolean lb5 = true;
            ad2 *= -1;
            Thought lo6 = Thought138.getInstance(ad3, ad4, fd0, fd1);
            ld3 *= -1;
            lb2 = ad1 < ad2;
            for(int i0=0; i0<10; i0++){
}}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
        fb1 = !lb0;
    fd0 = fd1 - fd0;
    lb1 = fb0 && fb1;
    Output.points[1][1] -= fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought218.getInstance();
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][2] += fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought188.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought51.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought190.getInstance();
    fb1 = !fb0;
    fb1 = !fb0;
        Thought lo4 = Thought115.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    Thought lo0 = Thought364.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}

package genetic;
import java.util.ArrayList;
class Thought62 extends Thought{
private static ArrayList<Thought62> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 145.66281362783573;
private double fd1 = 945.4646211895305;
private Thought fo0 = null;
private Thought fo1 = null;
Thought62 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought62 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought62 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought62 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought62 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 470.60992429135354;
    ld0 = fd0 - fd1;
    double ld1 = 925.0970888450547;
    Thought lo2 = Thought79.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    ld0 *= -1;
    boolean lb4 = true;
    double ld5 = 567.9711946499006;
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld0);
}
    lb3 = lb4 && fb0;
    double ld6 = 937.5555529117405;
    fb1 = !lb3;
    ld1 *= -1;
    ld5 = ld6 - fd0;
    lb4 = fd1 > ld0;

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
      fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[5][3] += fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought10.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
    double ld3 = 224.02149460487877;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, fd0, fd1);
}
    lb0 = lb1 && ab1;
    boolean lb4 = true;

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
    fb1 = !fb0;
    ad1 = ad2 - ad3;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    lb0 = !fb0;
    boolean lb1 = false;
    fd0 = fd1 - ad1;

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
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[5][4] -= fd1;
    Output.points[5][5] -= ad1;
    fb0 = fb1 && ab1;
    ad2 = ad3 - ad4;
    Output.points[5][6] -= fd0;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    Thought lo2 = Thought24.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab4 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought30.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    Output.points[5][7] -= ad4;
        fd0 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo1 = Thought50.getInstance(ad4, fd0, fd1, ad1);
    Thought lo2 = Thought75.getInstance(fb0, fb1, lb0, fb0);
    boolean lb3 = false;
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;
    lb3 = fd0 < fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && lb0;
    boolean lb4 = false;
    Output.points[5][8] -= fd0;
    if (lb3) {
        lb4 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, lb0, lb3, lb4);
}
        fb0 = fb1 && lb0;
        ad4 = fd0 - fd1;
        lb3 = ad1 > ad2;
        lb4 = ad3 > ad4;
        fb0 = fd0 < fd1;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2();
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 816.4108329507799;
    fd0 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
    Thought lo2 = Thought5.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ld1;
        fb0 = !fb1;

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
        Thought lo0 = Thought60.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
if(ao1 != null){
          fd1 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
        ab4 = fb0 && fb1;
        double ld2 = 286.5281147235261;
if(fo0 != null){
          ao4 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ad1);
}
        Thought lo3 = Thought96.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        fd1 = ld2 - ad1;
        fb0 = ad2 < ad3;
        Output.points[6][0] -= ad4;
        fb1 = fd0 > fd1;
        boolean lb4 = false;
        lb1 = lb4 || ab1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 577.8288791599505;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    boolean lb1 = true;
    double ld2 = 629.8266771574944;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, fd0, fd1);
}
    boolean lb3 = false;
    double ld4 = 515.705886773192;
    double ld5 = 972.6842615369442;
    ld0 *= -1;
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb6, fb0, fb1);
}
    Thought lo7 = Thought18.getInstance(fo1, fo0, fo1, fo0, ld2, ld4, ld5, fd0);
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld4, ld5, fd0, fd1, lb1, lb3, lb6, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb3, lb6);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    double ld0 = 983.0874706784704;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought77.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    double ld2 = 410.652758455587;
if(fo0 != null){
      ld2 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, ld2);
}
    fd0 = fd1 - ld0;
    ab1 = ab2 && ab3;
    ld2 = fd0 + fd1;
    ab4 = ld0 > ld2;
    fd0 = fd1 - ld0;
    ld2 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    double ld3 = 382.87753302984044;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld3, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought29.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 54.80095812445446;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fd1 > ld0;
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    boolean lb1 = true;
    double ld2 = 868.6249899616155;
    Thought lo3 = Thought56.getInstance(fd0, fd1, ld0, ld2);
    Thought lo4 = Thought46.getInstance(fb0, fb1, lb1, fb0);
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb1 || fb0;
    boolean lb5 = false;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, ld2, ad1, lb1, lb5, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2();
}
    Thought lo6 = Thought52.getInstance(ad2, ad3, ad4, fd0);
    boolean lb7 = true;

Thought.STACK_COUNTER++;
return lb5;
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
    Output.points[6][1] -= ad2;
    double ld0 = 368.5703220920755;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    fd1 = ld0 + ad1;
    ab2 = ad2 > ad3;
    ab3 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld1 = 591.2465789349214;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    ld0 = ld1 - ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought99.getInstance(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
    fd1 = ld0 + ld1;

Thought.STACK_COUNTER++;
return ab4;
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
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      fb1 = ao2.m2();
}
    Thought lo0 = Thought39.getInstance(fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = true;
    lb2 = !lb3;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
if(ao1 != null){
          fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        double ld0 = 51.9188811142792;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        ad1 = ad2 - ad3;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
        if (fb1) {
            double ld1 = 800.122657335513;
if(ao1 != null){
              ao1.m3();
}
            double ld2 = 72.30505563137415;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][2] -= fd1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = ab1 && ab2;
    ab3 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        double ld0 = 8.650500101113764;
        boolean lb1 = false;
        fd0 = fd1 + ld0;
        boolean lb2 = true;
        Output.points[6][3] += fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
        ab4 = fb0 && fb1;
if(ao2 != null){
          lb1 = ao2.m2(fd1, ld0, fd0, fd1, lb2, ab1, ab2, ab3);
}
        Output.points[6][4] += ld0;
        fd0 = fd1 + ld0;
        Thought lo3 = Thought63.getInstance();
        ab4 = fd0 < fd1;
        ld0 *= -1;
        double ld4 = 312.7083722296324;
        fb0 = fb1 && lb1;
}
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
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
    double ld0 = 895.8773660226906;
    boolean lb1 = false;
    ld0 *= -1;
    Thought lo2 = Thought2.getInstance(ab3, ab4, fb0, fb1);
    lb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    double ld3 = 259.1557918043127;
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
    ld0 = ld3 + ad1;
    fb1 = lb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, ab1, ab2);
}
    ld0 *= -1;
    Thought lo4 = Thought29.getInstance(ao2, ao3, ao4, fo0);
    ab3 = ld3 > ad1;

Thought.STACK_COUNTER++;
return ab4;
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
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought57.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
    ab4 = fd0 < fd1;
    Thought lo2 = Thought44.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld3 = 296.76781377429074;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    ld3 = fd0 + fd1;
    boolean lb4 = false;
    lb4 = ab1 || ab2;
    ab3 = ld3 < fd0;
    if (ab4) {
        fd1 = ld3 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld3, fd0, fd1, fb1, lb0, lb1, lb4);
}
        } else if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4();
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Thought lo0 = Thought76.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][5] -= ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 < ad1;
    ad2 = ad3 - ad4;
    Output.points[6][6] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ab1 = ad4 < fd0;
    ab2 = fd1 < ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought68.getInstance(ab3, ab4, fb0, fb1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[6][7] -= fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = fb0 && fb1;

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
    fb0 = ad2 < ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    double ld0 = 844.6756366775013;
    boolean lb1 = false;
    double ld2 = 957.6299733118352;
    ld2 = ad1 - ad2;
    fb0 = ad3 < ad4;
    fb1 = lb1 || fb0;
if(ao2 != null){
      fd0 = ao2.m3();
}
    double ld3 = 547.1989972942431;
    fb1 = lb1 && fb0;
    fd0 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought81.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    if (ab1) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
        fd1 = fd0 - fd1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        Output.points[6][8] -= fd1;
        ab4 = fd0 > fd1;
        fd0 *= -1;
        fd1 *= -1;
        Thought lo1 = Thought94.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo1 != null){
          fo1.m1();
}
        ab3 = fd0 > fd1;
        ab4 = fd0 < fd1;
        double ld2 = 169.14618498179217;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Thought lo0 = Thought2.getInstance(fd0, fd1, ad1, ad2);
    boolean lb1 = false;
    ad3 = ad4 - fd0;
    lb1 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
        Output.points[7][0] -= fd1;
    fb1 = lb1 || ab1;
    Output.points[7][1] += ad1;
    Thought lo2 = Thought47.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb3 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;

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
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
          fo1.m1(fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Output.points[7][2] -= fd0;
        fb0 = fb1 || fb0;
        fd1 = fd0 - fd1;
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fb0 = !fb1;
        fd0 = fd1 - fd0;
        fb0 = fb1 || fb0;
        double ld0 = 108.12208976248023;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fd1 > fd0;
    Output.points[7][3] -= fd1;
    boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought9.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        Thought lo3 = Thought49.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        lb0 = fd1 > fd0;
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fd0 = fo1.m3();
}
        Thought lo4 = Thought16.getInstance(fd1, fd0, fd1, fd0);
        ab1 = !ab2;
}
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
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought37.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 || fb1;
    lb1 = ad2 < ad3;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = ad2 < ad3;
    fb0 = !fb1;
        ab1 = ab2 || ab3;
    ab4 = ad4 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > ad1;
    Thought lo1 = Thought72.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);

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
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[7][4] -= fd1;
        fb0 = !fb1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought64.getInstance();
        fd0 = fd1 - fd0;
        fb0 = fb1 && fb0;
        boolean lb1 = true;
        double ld2 = 403.7568221146156;
        }
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fb1, fb0, fb1, fb0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    double ld0 = 784.2696420116878;
    Thought lo1 = Thought13.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    double ld2 = 5.163369396070238;
    fb0 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ld2, ad1, fb1, fb0, fb1, fb0);
}
    double ld3 = 68.18740283295985;
        Thought lo4 = Thought46.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return ao4;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought94.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb1 = ab1 && ab2;
    Output.points[7][5] += fd1;
    ab3 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[7][6] -= fd1;
    lb1 = fd0 < fd1;
    boolean lb2 = true;
    lb2 = !ab1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = ad1 < ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[7][7] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought86.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
    if (fb1) {
        lb0 = lb1 && ab1;
        ab2 = ad2 < ad3;
        for(int i0=0; i0<10; i0++){
            }
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
}
Thought.STACK_COUNTER++;
return ao1;
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
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought45.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld1 = 81.31707905237738;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    lb2 = !fb0;
    fb1 = lb2 || fb0;
    ld1 *= -1;
    Output.points[7][8] -= fd0;
    boolean lb3 = true;
    Output.points[8][0] -= fd1;
    fb0 = ld1 < fd0;
    fb1 = fd1 > ld1;
    lb2 = lb3 && fb0;

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
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    Output.points[8][1] -= fd0;
    boolean lb0 = false;
        lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    fb0 = !fb1;
    fd1 *= -1;
    Output.points[8][2] += fd0;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    double ld1 = 383.93458328130714;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb2 = ld1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    boolean lb3 = false;

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
    Output.points[8][3] -= fd0;
    boolean lb0 = false;
    Thought lo1 = Thought7.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 188.138179654743;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ld2 = fd0 - fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3();
}
    ld2 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    ld2 = fd0 + fd1;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld3 = 957.2865439974169;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    ld2 = ld3 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fd1, ld2, ld3, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb4 = true;

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

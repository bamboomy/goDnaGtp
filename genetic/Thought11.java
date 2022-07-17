package genetic;
import java.util.ArrayList;
class Thought11 extends Thought{
private static ArrayList<Thought11> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 347.01575443268496;
private double fd1 = 841.6273521277565;
private Thought fo0 = null;
private Thought fo1 = null;
Thought11 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought11 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought11 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought11 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought11 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought71.getInstance(fd1, fd0, fd1, fd0);
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Thought lo1 = Thought370.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        Thought lo2 = Thought115.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fd1 = fd0 - fd1;
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
    fd0 = fd1 - fd0;
    double ld0 = 284.12000493645974;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Thought lo2 = Thought135.getInstance(ab4, fb0, fb1, lb1);
    fd1 = ld0 - fd0;
    double ld3 = 937.2296918788605;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld4 = 18.429176456998594;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld0);
}
    double ld5 = 75.30282316925143;
    for(int i0=0; i0<10; i0++){
        Output.points[2][8] -= ld3;
        double ld6 = 176.9327221832683;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld4, ld5, fd0);
}
        fd1 = ld6 - ld0;
        ab1 = ld3 > ld4;
        Thought lo7 = Thought131.getInstance(ld5, fd0, fd1, ld6, ab2, ab3, ab4, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought354.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb1 = false;
    fb0 = ad2 < ad3;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
        double ld2 = 883.958998092177;
        fb0 = ad1 > ad2;
        fb1 = lb1 || fb0;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb1, fb0, fb1);
}
        Thought lo3 = Thought287.getInstance(fo1, fo0, fo1, fo0);
        Thought lo4 = Thought134.getInstance(ld2, ad1, ad2, ad3);
        lb1 = ad4 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2);
}
        boolean lb5 = false;
        lb1 = fb0 || fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3();
}
    ad1 *= -1;
    ab3 = ad2 > ad3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 < ad3;
    Thought lo0 = Thought80.getInstance(ab4, fb0, fb1, ab1);
    ad4 *= -1;
    fd0 *= -1;
    ab2 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ad2 > ad3;
    ab4 = ad4 > fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Output.points[3][0] -= fd0;
    Thought lo0 = Thought74.getInstance(fd1, fd0, fd1, fd0);
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought133.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;

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
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 838.9340688489932;
    ad1 = ad2 - ad3;
    Output.points[3][1] += ad4;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[3][2] -= fd0;
if(ao4 != null){
      fb0 = ao4.m2(fd1, ld0, ad1, ad2);
}
    fb1 = ad3 > ad4;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2);
}
    boolean lb1 = true;
if(ao4 != null){
      fb0 = ao4.m2(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought295.getInstance();
    double ld3 = 320.3252883856534;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    ad4 *= -1;
    fd0 = fd1 + ld0;
    Output.points[3][3] += ld3;
    Output.points[3][4] -= ad1;
    double ld4 = 695.3986705499138;
    fb1 = !lb1;
    double ld5 = 724.1286575519362;
    Output.points[3][5] -= ld5;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb1, fb0, fb1);
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
    fd0 = fd1 + fd0;
    Output.points[3][6] -= fd1;
    fd0 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[3][7] -= fd0;
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    fb1 = !lb0;
    Output.points[3][8] += fd1;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld1 = 207.03382620950632;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
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
    ab2 = ab3 || ab4;
    ad2 = ad3 - ad4;
    Output.points[4][0] += fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;
    fd1 = ad1 + ad2;
    fb1 = ab1 && ab2;
    Output.points[4][1] -= ad3;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, ab1);
}
    Output.points[4][2] -= ad4;
    ab2 = ab3 && ab4;
        fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ad1);
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought209.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought262.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    Output.points[4][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld3 = 407.88416486926747;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[4][4] -= fd1;
        ld3 *= -1;
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && lb4;
        lb0 = fd0 < fd1;
        boolean lb5 = true;
if(fo0 != null){
          fo1 = fo0.m4(ld3, fd0, fd1, ld3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
        fd1 = ld3 + fd0;
}
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
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld1 = 828.2969291660605;
    fb1 = lb0 || ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought130.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
    boolean lb3 = false;
    lb3 = fd1 < ld1;
        Output.points[4][5] += fd0;
    fd1 = ld1 + fd0;
    ab1 = !ab2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    fb0 = !fb1;
    Thought lo0 = Thought198.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    Output.points[4][6] += fd1;
    ad1 = ad2 - ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    Thought lo1 = Thought281.getInstance(lb0, fb0, fb1, lb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo2 = Thought301.getInstance(fd0, fd1, fd0, fd1);
    boolean lb3 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb3);
}
    Thought lo4 = Thought320.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb3);
}
    boolean lb5 = false;
    lb5 = fb0 && fb1;
    lb0 = !lb3;
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4(lb5, lb6, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld7 = 24.315241680716092;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][7] += ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[4][8] += fd1;
    ad1 = ad2 + ad3;
        fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought248.getInstance();
    Output.points[5][0] -= ad2;
    Thought lo1 = Thought383.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought243.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
if(ao4 != null){
      ao4.m2();
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
    lb2 = !ab1;
    ab2 = fd0 < fd1;
    Thought lo3 = Thought177.getInstance(ab3, ab4, fb0, fb1);
    lb0 = !lb2;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab2 = ab3 || ab4;
    Output.points[5][1] += fd0;
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return lb2;
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
    ab1 = ad2 > ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    Output.points[5][2] -= ad2;
    Output.points[5][3] += ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 653.0847272460562;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    double ld1 = 181.15282641639158;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao2.m1();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    Output.points[5][4] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
    Output.points[5][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb1 = !lb2;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, lb3);
}
    double ld5 = 286.5531795044473;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][6] += fd1;
    ld5 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld5;
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
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = fd1 > fd0;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    Output.points[5][7] += fd0;
        ab2 = fd1 < fd0;
        Thought lo0 = Thought78.getInstance(fd1, fd0, fd1, fd0);

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        Output.points[5][8] += ad4;
    fd0 *= -1;
    double ld0 = 602.0894698459769;
    boolean lb1 = true;
    Output.points[6][0] += fd0;
    fd1 = ld0 - ad1;
    Thought lo2 = Thought371.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);

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
    boolean lb0 = false;
    lb0 = ad2 < ad3;
    ab1 = ad4 > fd0;
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = !fb0;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought144.getInstance();
    double ld2 = 893.2641492176103;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    boolean lb3 = true;
    double ld4 = 925.8763928913731;
    ld4 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    Thought lo5 = Thought139.getInstance(fd0, fd1, ld2, ld4);
    Output.points[6][1] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb3 = fd1 < ld2;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ld4 = fo1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    lb3 = ab1 && ab2;
    fd0 *= -1;
    double ld6 = 389.9189394903549;
    double ld7 = 956.9622873264535;
    boolean lb8 = false;

Thought.STACK_COUNTER++;
return ad4;
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 846.7212155579671;
    double ld1 = 374.1904938013968;
if(fo1 != null){
      ld0 = fo1.m3();
}
    fb0 = ld1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought55.getInstance(ao3, ao4, fo0, fo1);
        fd1 = ld0 - ld1;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld0, ld1, fd0);
}
        Output.points[6][2] += fd1;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        ld0 = ld1 - fd0;
        fb1 = fb0 || fb1;
        fd1 *= -1;
        ld0 = ld1 - fd0;
        Thought lo3 = Thought195.getInstance();
        fb0 = !fb1;
        fb0 = fd1 > ld0;
        Output.points[6][3] += ld1;
        fd0 = fd1 + ld0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          ao1.m3(fb0, fb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return ld1;
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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
    lb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    if (fb0) {
        Output.points[6][4] += fd1;
        fb1 = ad1 < ad2;
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
        ad2 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
}
Thought.STACK_COUNTER++;
return ad3;
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
    if (ab1) {
        ab2 = ab3 || ab4;
if(ao1 != null){
          fb0 = ao1.m2();
}
        boolean lb0 = true;
        double ld1 = 197.0321763667776;
        boolean lb2 = false;
        boolean lb3 = false;
        ab3 = fd0 < fd1;
        double ld4 = 661.5722751730574;
        ab4 = fb0 || fb1;
        lb0 = ld1 > ld4;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ld4, fd0, lb2, lb3, ab1, ab2);
}
        Output.points[6][5] -= fd1;
        ab3 = ld1 < ld4;
        } else {
        if (ab1) {
            fd0 *= -1;
            ab2 = ab3 && ab4;
            fd1 *= -1;
            Thought lo5 = Thought273.getInstance(fb0, fb1, ab1, ab2);
            ab3 = ab4 || fb0;
            fb1 = fd0 > fd1;
            fd0 = fd1 - fd0;
            ab1 = fd1 > fd0;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought132.getInstance(ao2, ao3, ao4, fo0);
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1, fb1, lb0, lb2, ab1);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    double ld3 = 262.1935502558867;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = lb0 || lb2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m1(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld3, ad1, ad2);
}
}
Thought.STACK_COUNTER++;
return ad3;
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
    if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought69.getInstance();
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
              fo0.m2(fb0, fb1, fb0, fb1);
}
            fb0 = fd1 < fd0;
            Output.points[6][6] += fd1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1);
}
            Output.points[6][7] += fd0;
            for(int i1=0; i1<10; i1++){
}}}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 427.0994655745044;
    Output.points[6][8] -= ld0;
    Thought lo1 = Thought35.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought300.getInstance();
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ld0 < fd0;
    double ld3 = 607.2361808487523;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    ld0 = ld3 + fd0;
    Thought lo4 = Thought379.getInstance(fo0, fo1, fo0, fo1);
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld3, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    boolean lb5 = true;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        fd0 *= -1;
if(fo1 != null){
          fb0 = fo1.m2();
}
        Thought lo0 = Thought99.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
        ad4 *= -1;
        double ld1 = 548.3718456368157;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        ad4 = fd0 + fd1;
        fb1 = ld1 < ad1;
        fb0 = fb1 && fb0;
        fb1 = ad2 > ad3;
        Thought lo2 = Thought230.getInstance(fo0, fo1, fo0, fo1);
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ld1);
}
        ad1 = ad2 + ad3;
        Output.points[7][0] -= ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        boolean lb3 = true;
        double ld4 = 572.0883178318624;
if(fo1 != null){
          fo1.m2();
}
        lb3 = fb0 || fb1;
        lb3 = fd0 < fd1;
        ld1 = ld4 - ad1;
        boolean lb5 = true;
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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    Output.points[7][1] -= fd1;
    if (fb0) {
        boolean lb0 = true;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
        Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[7][2] += fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought133.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought48.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = !fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought29.getInstance(fb1, lb0, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[7][3] -= ad2;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    Output.points[7][4] -= ad2;
    Output.points[7][5] += ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
        ab1 = ab2 || ab3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    lb0 = !ab1;
if(ao2 != null){
      ao2.m3();
}
    Thought lo1 = Thought71.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      ao1.m1(fb1, lb0, ab1, ab2);
}
    ab3 = fd1 < fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld1 = 736.659504564926;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ad1);
}
    lb0 = ad2 < ad3;
    double ld2 = 818.9317246737904;
    ab1 = ad3 < ad4;
    boolean lb3 = false;
    ab1 = fd0 > fd1;
    Thought lo4 = Thought71.getInstance(ao1, ao2, ao3, ao4, ld1, ld2, ad1, ad2);
        ad3 = ad4 - fd0;
    Thought lo5 = Thought104.getInstance(fd1, ld1, ld2, ad1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, lb3, ab1);
}
    Thought lo6 = Thought262.getInstance();

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
    double ld0 = 949.4773554139815;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought74.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
if(fo0 != null){
      lb2 = fo0.m2(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ld0 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    boolean lb4 = false;
    lb4 = fb0 || fb1;

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
    fd1 *= -1;
    double ld0 = 904.7444983086657;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
    lb1 = lb2 && lb3;
    Output.points[7][6] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb4, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
    Thought lo5 = Thought221.getInstance(lb2, lb3, lb4, fb0);
    Output.points[7][7] += fd1;
    fb1 = !lb1;
    Thought lo6 = Thought138.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fd1 *= -1;
    lb2 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb3, lb4, fb0, fb1);
}
    boolean lb7 = true;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    boolean lb8 = true;
    lb1 = lb2 || lb3;
    ld0 = fd0 + fd1;
    lb4 = lb7 && lb8;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
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
    Output.points[7][8] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought315.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;

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

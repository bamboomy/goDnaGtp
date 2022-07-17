package genetic;
import java.util.ArrayList;
class Thought15 extends Thought{
private static ArrayList<Thought15> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 43.36850535991781;
private double fd1 = 563.0691917849778;
private Thought fo0 = null;
private Thought fo1 = null;
Thought15 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought15 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought15 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought103.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[7][5] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought181.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    boolean lb2 = true;

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m2();
}
        Thought lo3 = Thought224.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
        ab2 = ab3 || ab4;
        fb0 = !fb1;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(lb0, lb1, lb2, ab1);
}
            ab2 = ab3 || ab4;
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
            fb1 = fd1 > fd0;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
if(fo1 != null){
              ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              lb0 = fo0.m2();
}
}}
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought224.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][6] -= ad2;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    lb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    Thought lo3 = Thought151.getInstance(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought118.getInstance(fd0, fd1, ad1, ad2);
    Output.points[7][7] -= ad3;
    Output.points[7][8] -= ad4;
    Thought lo5 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    boolean lb6 = true;
    ad3 = ad4 + fd0;

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
    Thought lo0 = Thought79.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    double ld1 = 748.674273301854;
    Output.points[8][0] += fd0;
    fb1 = ab1 && ab2;
    fd1 = ld1 - ad1;
    ab3 = ad2 < ad3;
    boolean lb2 = true;
    ad4 = fd0 + fd1;
    boolean lb3 = true;
    Thought lo4 = Thought107.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    ld1 = ad1 - ad2;
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb2 = lb3 || ab1;
    if (ab2) {
        Thought lo5 = Thought331.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
        Output.points[8][1] += ld1;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(lb2, lb3, ab1, ab2);
}
        ab3 = ad2 < ad3;
        ab4 = fb0 && fb1;
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb2 = lb3 && ab1;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld1, ad1);
}
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
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    double ld1 = 704.5681586947647;
    fd0 *= -1;
    Thought lo2 = Thought243.getInstance();
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb3, fb0, fb1, lb0);
}
    boolean lb4 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    lb3 = lb4 && fb0;
    fb1 = lb0 && lb3;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      lb4 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb0);
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
    double ld0 = 131.49425381254642;
    ld0 *= -1;
    fb1 = !fb0;
    Output.points[8][2] -= ad1;
    Output.points[8][3] += ad2;
if(ao1 != null){
      ao1.m1();
}
    double ld1 = 260.95089093837333;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;

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
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        double ld0 = 444.1112387309263;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought44.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
    fb1 = ab1 || ab2;

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
    ad1 *= -1;
    double ld0 = 744.5243262242213;
    ad1 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        Output.points[8][4] -= ld0;
        ab4 = fb0 && fb1;
        lb1 = ad1 > ad2;
        ad3 = ad4 - fd0;
        fd1 = ld0 - ad1;
        ab1 = ab2 || ab3;
        boolean lb2 = false;
        ab3 = ab4 || fb0;
        ad2 = ad3 + ad4;
        double ld3 = 130.49829275917324;
        double ld4 = 540.9820513724617;
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
    boolean lb0 = true;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3();
}
    double ld1 = 864.1893555536825;
        ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    Output.points[8][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo3 = Thought363.getInstance(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    double ld0 = 703.1516935099977;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ld0 < fd0;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
    boolean lb2 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    if (fb1) {
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
        Output.points[8][6] -= ad1;
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        fb1 = !fb0;
        Thought lo0 = Thought287.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        fb1 = ad2 > ad3;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb1 = !fb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought152.getInstance(lb1, fb0, fb1, lb1);
        ad2 *= -1;
        fb0 = fb1 && lb1;
        Output.points[8][7] -= ad3;
        boolean lb3 = false;
        Thought lo4 = Thought62.getInstance(fo1, fo0, fo1, fo0);
        Output.points[8][8] -= ad4;
        fd0 = fd1 + ad1;
        ad2 = ad3 + ad4;
        Thought lo5 = Thought221.getInstance(fd0, fd1, ad1, ad2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = ad1 > ad2;
    double ld1 = 306.2655364860607;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ab3 = fo0.m2(ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 = fd0 - fd1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    double ld2 = 396.43226904202487;
    ab3 = ld1 > ld2;
    ab4 = !fb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought130.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    double ld2 = 224.91739911776256;
    ld2 = fd0 - fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, fd0, lb1, lb3, fb0, fb1);
}
    lb1 = fd1 > ld2;
    fd0 = fd1 - ld2;
    boolean lb4 = false;
    lb3 = lb4 || fb0;
    Thought lo5 = Thought276.getInstance(fo1, ao1, ao2, ao3, fb1, lb1, lb3, lb4);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb1, lb3);
}

Thought.STACK_COUNTER++;
return lb4;
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
    double ld0 = 175.64983751344792;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    double ld1 = 621.0144088256235;
    double ld2 = 91.67723978165847;
    boolean lb3 = false;
    Output.points[0][0] += ld0;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb3;
    ld1 = ld2 + ad1;
    boolean lb4 = true;
    lb4 = ad2 < ad3;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld2, ad1, ad2);
}
    double ld5 = 142.78931240830613;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb3, lb4);
}
    if (fb0) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    Output.points[0][1] -= fd1;
    ab3 = ab4 && fb0;
        double ld1 = 909.1964787657469;
    fb1 = ld1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        ab4 = fd0 > fd1;
        ld1 = fd0 + fd1;
        for(int i1=0; i1<10; i1++){
            ld1 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought124.getInstance(ao1, ao2, ao3, ao4);
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought189.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
    Thought lo2 = Thought352.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    Output.points[0][2] -= ad2;
    ad3 *= -1;
if(fo0 != null){
      ab3 = fo0.m2();
}
    boolean lb3 = false;
    ad4 = fd0 - fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought113.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought344.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Output.points[0][3] += fd1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][4] -= fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
    boolean lb0 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab4 = !fb0;
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 116.50532396816976;
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    double ld3 = 648.6548252603716;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought87.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    Output.points[0][5] += ad2;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        double ld0 = 393.204404164014;
        ab3 = ad1 > ad2;
        double ld1 = 675.7414209436658;
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
        for(int i0=0; i0<10; i0++){
            boolean lb2 = true;
            ab3 = ab4 && fb0;
            ad2 = ad3 - ad4;
            fd0 = fd1 - ld0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              ld1 = fo1.m3(ad1, ad2, ad3, ad4);
}
            for(int i1=0; i1<10; i1++){
                fb1 = fd0 < fd1;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
                lb2 = ab1 && ab2;
if(fo0 != null){
                  fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
                ld0 *= -1;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
                  fo1.m3();
}
                ld1 = ad1 + ad2;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
                boolean lb3 = true;
                lb2 = !ab1;
if(fo0 != null){
                  ld0 = fo0.m3(ab2, ab3, ab4, fb0);
}
                fb1 = lb3 && lb2;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
}}}
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Output.points[0][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb0;
    double ld2 = 605.5459317311942;

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
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd1 < ad1;
    Output.points[0][7] -= ad2;
        ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    double ld3 = 251.25740862314723;
    ad2 *= -1;

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
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought230.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[0][8] += fd0;
    double ld3 = 29.873472069792484;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought80.getInstance();
    for(int i0=0; i0<10; i0++){
        ab1 = fd0 < fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          ao1.m2(fb1, lb0, lb1, ab1);
}
        fd0 *= -1;
        fd1 = ld3 + fd0;
        ab2 = fd1 > ld3;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        ab3 = !ab4;
if(ao1 != null){
          fb0 = ao1.m2(fd0, fd1, ld3, fd0);
}
        Output.points[1][0] -= fd1;
        }
        ld3 = fd0 - fd1;
    for(int i1=0; i1<10; i1++){
        Thought lo5 = Thought330.getInstance(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld3);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m2();
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    Output.points[1][1] -= ad4;
    Thought lo0 = Thought362.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
if(ao4 != null){
          ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m1(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        fb1 = fd1 > ad1;
        boolean lb1 = false;
        lb1 = ad2 < ad3;
        boolean lb2 = false;
        lb2 = ad4 < fd0;
        }
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought289.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
if(ao3 != null){
      fb0 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought86.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 && fb1;
        fb0 = !fb1;
        fb0 = fd0 < fd1;
        Output.points[1][2] += fd0;
        double ld1 = 492.4946390527729;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ld1 *= -1;
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
        fb1 = fd0 > fd1;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought197.getInstance();
    lb0 = ab1 && ab2;
    Thought lo2 = Thought370.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    lb0 = !ab1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    double ld4 = 442.3063451894539;
    ab1 = ld4 > fd0;
    ab2 = fd1 < ld4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, fd0);
}
        ab3 = !ab4;
    boolean lb5 = false;

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
    Output.points[1][3] -= ad1;
    double ld0 = 213.25777508157861;
    double ld1 = 153.0830777395274;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    Output.points[1][4] -= ld1;
    ad1 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      lb3 = fo1.m2(fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb2;

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
    Output.points[1][5] -= ad1;
    ab2 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    Output.points[1][6] += ad2;
    double ld0 = 244.3908878386963;
    ab3 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ab4 = fb0 || fb1;
    Output.points[1][7] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld1 = 961.9277792400247;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ab1 && ab2;
    ad2 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    Output.points[1][8] += fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought303.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Output.points[2][0] -= fd0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    double ld2 = 611.890084170553;
    double ld3 = 252.46289090144518;
    boolean lb4 = true;
    lb4 = fb0 || fb1;

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
    Thought lo0 = Thought183.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought200.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    boolean lb2 = true;
    fb0 = fd1 > ad1;
    fb1 = lb2 || fb0;
    Thought lo3 = Thought130.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    fb1 = lb2 && fb0;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
if(ao3 != null){
      ab4 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;
    Output.points[2][1] += fd1;
    fd0 = fd1 + fd0;
    Output.points[2][2] += fd1;
    double ld0 = 192.04490300676045;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    double ld1 = 771.4748781292395;
    ld0 *= -1;
    double ld2 = 641.7430440898017;
    double ld3 = 182.41084439578805;
    Output.points[2][3] -= ld1;
        boolean lb4 = true;
    ab1 = ld2 < ld3;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[2][4] += fd0;

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
    lb0 = ab1 && ab2;
    Thought lo1 = Thought397.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    lb0 = !ab1;
    Thought lo2 = Thought310.getInstance(ab2, ab3, ab4, fb0);
        fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fb1 = ad3 > ad4;
    boolean lb3 = true;
    boolean lb4 = false;
    lb0 = !lb3;
    boolean lb5 = true;
    if (lb4) {
}
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
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    lb0 = !lb1;
    fd0 *= -1;
    Thought lo3 = Thought185.getInstance(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
    boolean lb4 = true;
    fd1 = fd0 + fd1;
    lb1 = lb2 && lb4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    lb2 = lb4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 < fd0;
    boolean lb5 = false;
    Thought lo6 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, lb2, lb4);
if(fo1 != null){
      lb5 = fo1.m2(fb0, fb1, lb0, lb1);
}
    double ld7 = 840.0041926568376;
    lb2 = fd0 > fd1;

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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    lb2 = lb3 || fb0;
    fb1 = lb0 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    Thought lo4 = Thought346.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);

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
    boolean lb0 = true;
    double ld1 = 15.385844987173487;
    Thought lo2 = Thought117.getInstance(lb0, fb0, fb1, lb0);
    ld1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    ld1 = fd0 - fd1;
    boolean lb3 = false;
    Thought lo4 = Thought33.getInstance(fo1, fo0, fo1, fo0);
    double ld5 = 106.85351819295641;
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
}

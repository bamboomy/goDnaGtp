package genetic;
import java.util.ArrayList;
class Thought6 extends Thought{
private static ArrayList<Thought6> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 694.5406303176377;
private double fd1 = 426.30254474289;
private Thought fo0 = null;
private Thought fo1 = null;
Thought6 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought6 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought6 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought6 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought6 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb1 = fb0 || fb1;
        double ld0 = 161.66414710639967;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m2();
}
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        double ld1 = 797.1376952296717;
        fb1 = fb0 && fb1;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
            fb0 = !fb1;
            boolean lb2 = true;
            fd0 *= -1;
            double ld3 = 923.2439102427936;
            lb2 = fd0 > fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld0, ld1, fd0, fb0, fb1, lb2, fb0);
}
            fb1 = fd1 < ld3;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
            Thought lo4 = Thought72.getInstance(ld0, ld1, fd0, fd1);
            fb0 = fb1 && lb2;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    Output.points[1][1] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought50.getInstance(fb1, lb0, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 660.7289315985222;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd1 = ld0 + ad1;
    Thought lo2 = Thought12.getInstance();
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + ad1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
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
    Thought lo0 = Thought76.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought29.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 || fb1;
    if (fb0) {
        fb1 = fd0 > fd1;
        fd0 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
        boolean lb0 = false;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
        fd1 *= -1;
        fb0 = fb1 || lb0;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && lb0;
        Thought lo1 = Thought42.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        boolean lb2 = true;
        lb2 = !fb0;
if(fo1 != null){
          fd1 = fo1.m3(fb1, lb0, lb2, fb0);
}
        boolean lb3 = true;
if(ao1 != null){
          ao1.m1();
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    double ld0 = 390.3196493287564;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 670.0386506251746;
if(ao1 != null){
      ao1.m3(fd0, fd1, ld0, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    fb0 = !fb1;
    boolean lb2 = false;
    ld1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb2 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought75.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
        double ld4 = 485.27024084415046;
        Output.points[1][2] += ld4;
        fb1 = !lb2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    ab1 = fd0 < fd1;
        fd0 = fd1 - fd0;
    Output.points[1][3] -= fd1;
    ab2 = fd0 < fd1;
    double ld1 = 10.065284865211055;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 < fd1;
    ld1 = fd0 + fd1;
    if (ab2) {
        boolean lb2 = true;
        Output.points[1][4] += ld1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, lb2, lb0, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab2 = ld1 > fd0;
        fd1 = ld1 - fd0;
        fd1 = ld1 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld1 = fd0 + fd1;
        boolean lb3 = false;
if(ao3 != null){
          ld1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, lb2, lb3, lb0, ab1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ad3 = ad4 - fd0;
    double ld2 = 709.7335254770547;
    lb1 = ab1 && ab2;
    boolean lb3 = true;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld2, ad1);
}
    boolean lb4 = true;
    ab2 = ab3 || ab4;
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    double ld5 = 449.7882232190155;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, lb3);
}
if(ao1 != null){
      lb4 = ao1.m2();
}
if(ao2 != null){
      ld5 = ao2.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb6 = true;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld5, fb0, fb1, lb0, lb1);
}
    Thought lo7 = Thought1.getInstance(ao1, ao2, ao3, ao4, lb3, lb4, lb6, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ld5);
}
    ab2 = !ab3;
    ab4 = !fb0;

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
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    boolean lb2 = false;
    Output.points[1][5] += fd0;
    Output.points[1][6] -= fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    lb1 = fd1 < fd0;
    boolean lb3 = true;
    lb2 = fd1 > fd0;
    lb3 = fd1 < fd0;
    Thought lo4 = Thought59.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    Thought lo5 = Thought46.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
    Output.points[1][7] += fd1;
    fd0 *= -1;
    Thought lo6 = Thought6.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, lb3, fb0);
    if (fb1) {
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought27.getInstance();
    ab4 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}

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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
        Thought lo0 = Thought88.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    Thought lo1 = Thought39.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = fb0 || fb1;
    ad3 = ad4 + fd0;

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
    ab2 = ad2 > ad3;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    double ld0 = 150.58860538925865;
if(fo0 != null){
          ad3 = fo0.m3();
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ad4 < fd0;
    boolean lb1 = true;
    Thought lo2 = Thought36.getInstance(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    Thought lo3 = Thought71.getInstance(fo1, fo0, fo1, fo0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][8] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[2][0] -= fd1;
    fb1 = !fb0;
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;

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
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought97.getInstance();
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb1 = false;
        boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
        boolean lb3 = false;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        lb1 = lb2 || lb3;
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
        boolean lb4 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, lb4, fb0, fb1);
}
if(ao2 != null){
          fd1 = ao2.m3(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        for(int i1=0; i1<10; i1++){
            Thought lo5 = Thought0.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
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
    ab2 = !ab3;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 && ab4;
    fd1 *= -1;
    if (fb0) {
        fb1 = ab1 && ab2;
        } else {
        boolean lb0 = true;
        fd0 *= -1;
        Output.points[2][1] -= fd1;
        for(int i0=0; i0<10; i0++){
            ab2 = !ab3;
if(ao4 != null){
              fd0 = ao4.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
            double ld1 = 762.3699758204829;
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
              ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ad1 < ad2;
    ab4 = !fb0;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    Output.points[2][2] -= ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ab3 = !ab4;
    fb0 = fb1 || lb0;
    ab1 = ab2 && ab3;
    Output.points[2][3] += ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    Output.points[2][4] -= ad2;
    double ld1 = 942.5724708317499;
    if (ab4) {
if(ao2 != null){
          ao2.m3();
}
        Thought lo2 = Thought27.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
        ab2 = fd1 > ld1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        Output.points[2][5] += ad1;
        for(int i0=0; i0<10; i0++){
            ad2 = ad3 + ad4;
if(ao2 != null){
              fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
}}
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
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    double ld2 = 865.9967044545182;
    double ld3 = 153.51372265367522;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    double ld0 = 540.9261779566713;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought97.getInstance(ld0, fd0, fd1, ld0);
    if (ab3) {
        for(int i0=0; i0<10; i0++){
            boolean lb2 = true;
            ab3 = ab4 && fb0;
            fb1 = lb2 || ab1;
            fd0 = fd1 + ld0;
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought21.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    ad4 = fd0 + fd1;
    Thought lo1 = Thought40.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ab3 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    if (ab3) {
        double ld1 = 120.40228998383373;
        ab4 = fb0 || fb1;
        Output.points[2][6] += ad4;
        lb0 = ab1 || ab2;
        fd0 = fd1 - ld1;
        ad1 = ad2 + ad3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb1 = fd1 < fd0;
    boolean lb2 = true;
    double ld3 = 412.3316491047611;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = ld3 - fd0;
    lb2 = !fb0;
    fd1 = ld3 - fd0;
    Thought lo4 = Thought14.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb1, lb2);
    double ld5 = 883.3255347014893;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld3, ld5);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld3, ld5);
}
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fb1, lb0, lb1, lb2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ad2 < ad3;
    fb0 = fb1 || fb0;
    Output.points[2][7] -= ad4;
    fb1 = fd0 > fd1;
    Output.points[2][8] -= ad1;
    fb0 = !fb1;
    Thought lo0 = Thought79.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought46.getInstance(fd0, fd1, ad1, ad2);
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    for(int i0=0; i0<10; i0++){
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought26.getInstance(ao2, ao3, ao4, fo0);
    Thought lo1 = Thought17.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    ab4 = fd1 < fd0;
    boolean lb2 = true;
        ab4 = fb0 || fb1;
    double ld3 = 538.9496505012964;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m2(fd0, fd1, ld3, fd0);
}
    fd1 *= -1;

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
    Thought lo0 = Thought67.getInstance(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    ad2 = ad3 + ad4;
    Thought lo1 = Thought32.getInstance(ao2, ao3, ao4, fo0);
    boolean lb2 = false;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Output.points[3][0] += fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb2, ab1, ab2);
}
    Output.points[3][1] -= fd0;
    fd1 = ad1 + ad2;
    ab3 = ad3 < ad4;
    fd0 *= -1;
    fd1 *= -1;
    double ld3 = 405.79717025251654;
    ab4 = !fb0;
    fb1 = ld3 < ad1;
    Thought lo4 = Thought1.getInstance(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
if(ao3 != null){
      ab4 = ao3.m2(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld3, ad1, ad2);
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
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought7.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    boolean lb2 = false;
    fb0 = !fb1;
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = lb0 || lb2;
    fb0 = fb1 || lb0;
    fd1 *= -1;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld3 = 802.4537644822947;
    ld3 = fd0 + fd1;
    fb0 = fb1 || lb0;
    lb2 = !fb0;
    fb1 = lb0 || lb2;
    Thought lo4 = Thought34.getInstance(fb0, fb1, lb0, lb2);

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
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
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
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 509.8911571647256;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
        fb1 = !fb0;
        Thought lo1 = Thought92.getInstance(ld0, ad1, ad2, ad3);
        ad4 *= -1;
        fd0 *= -1;
        Thought lo2 = Thought57.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
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
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    Output.points[3][2] += ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = ad1 + ad2;
    Output.points[3][3] -= ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    Thought lo0 = Thought55.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
    Thought lo2 = Thought21.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    fd1 = ad1 + ad2;
    double ld3 = 371.609227349572;
    lb1 = !ab1;
    double ld4 = 783.9825742683255;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
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
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought43.getInstance();
    boolean lb2 = true;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought31.getInstance(ao4, fo0, fo1, ao1);
}
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
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && lb0;
    fb0 = ad4 > fd0;
    fb1 = lb0 && fb0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought20.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;
    Thought lo2 = Thought88.getInstance();

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab4 = fd0 > fd1;
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    double ld1 = 772.8131270534668;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought59.getInstance(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
    ld1 = fd0 - fd1;
    boolean lb3 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    double ld0 = 354.94184601737567;
    Thought lo1 = Thought65.getInstance(ad1, ad2, ad3, ad4);
    double ld2 = 903.7921373211931;
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought86.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
        boolean lb4 = true;
        ld2 *= -1;
if(fo1 != null){
          ad1 = fo1.m3(ab4, fb0, fb1, lb4);
}
        Output.points[3][4] -= ad2;
if(ao1 != null){
          ao1.m1();
}
}
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
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought26.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[3][5] += fd0;
    lb1 = !fb0;
    fb1 = !lb1;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      lb2 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb3 = fb0 && fb1;
    lb1 = lb2 && lb3;
    fb0 = fb1 && lb1;
if(fo1 != null){
      lb2 = fo1.m2(lb3, fb0, fb1, lb1);
}
    lb2 = lb3 || fb0;
    Thought lo4 = Thought33.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb2, lb3);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo5 = Thought41.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
    lb1 = fd0 < fd1;

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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
        fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought29.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought29.getInstance(fb0, fb1, fb0, fb1);
    double ld2 = 74.84788090487777;
    Thought lo3 = Thought36.getInstance();
    ld2 *= -1;
        fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld2;

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
    Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought96.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld2 = 964.042781066107;
    Thought lo3 = Thought97.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
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
}

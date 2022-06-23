package genetic;
import java.util.ArrayList;
class Thought43 extends Thought{
private static ArrayList<Thought43> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 835.0912454443652;
private double fd1 = 787.5077740417615;
private Thought fo0 = null;
private Thought fo1 = null;
Thought43 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought43 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought43 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
    Output.points[1][7] -= fd0;
    boolean lb0 = true;
    Thought lo1 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    boolean lb4 = true;
    Output.points[1][8] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = lb3 || lb4;
    Thought lo5 = Thought64.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
    lb3 = !lb4;
    fd0 *= -1;
    Thought lo6 = Thought47.getInstance();
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[2][0] += fd1;
    fb0 = fd0 < fd1;
    Thought lo7 = Thought57.getInstance(fb1, lb0, lb2, lb3);
    lb4 = fd0 > fd1;
    double ld8 = 749.8419784633176;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld8, fd0, fd1, ld8);
}
    boolean lb9 = true;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab4 = fb0 || fb1;
    lb0 = lb1 && ab1;
    fd0 *= -1;
    double ld2 = 259.5914892980865;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
    double ld3 = 372.1891791686106;
    ld2 = ld3 + fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, ld3, fd0);
    fd1 = ld2 - ld3;
    fd0 = fd1 + ld2;

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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    ad2 = ad3 + ad4;
    fb1 = !fb0;
    fd0 = fd1 - ad1;
    Output.points[2][1] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
    double ld0 = 562.185712565995;
    Thought lo1 = Thought38.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = ld0 > ad1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
        fb1 = !fb0;
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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought67.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    boolean lb1 = true;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fd1 = ad1 + ad2;
    fb1 = lb1 && ab1;
    ab2 = ad3 > ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    ab3 = ab4 || fb0;
    double ld2 = 590.9434553236584;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 278.6920665490292;
if(ao2 != null){
      ao2.m1();
}
    Output.points[2][2] -= ld0;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    lb1 = fb0 && fb1;
    Output.points[2][3] += fd1;
    Thought lo2 = Thought47.getInstance(lb1, fb0, fb1, lb1);
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    double ld3 = 37.189609276048856;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld3, fb0, fb1, lb1, fb0);
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
    if (fb0) {
        boolean lb0 = false;
        ad1 = ad2 + ad3;
        Thought lo1 = Thought94.getInstance();
        double ld2 = 686.9324127488401;
        fb0 = ad3 > ad4;
        fd0 *= -1;
        fb1 = !lb0;
        double ld3 = 107.19246994216647;
if(ao1 != null){
          ao1.m1(fd0, fd1, ld2, ld3);
}
        fb0 = !fb1;
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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    double ld1 = 754.4769073068604;
    ld1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
    double ld2 = 768.0271517355412;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
    boolean lb3 = false;
    fd1 = ld1 + ld2;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ld2, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = lb0 || lb3;
if(fo0 != null){
      ao4 = fo0.m4();
}
    if (ab1) {
        ab2 = ld1 < ld2;
        ab3 = ab4 && fb0;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld1, ld2);
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb0, lb3, ab1);
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
    Output.points[2][4] -= ad1;
    ab2 = ad2 < ad3;
    ab3 = ad4 > fd0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab4 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
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
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 722.8528576015191;
    Output.points[2][5] -= ld1;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 || fb1;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld1, fd0);
}
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
            Output.points[2][6] -= fd1;
            double ld2 = 123.70450191603129;
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld1, fd0, fd1);
}
            double ld3 = 539.4501066260163;
            fb1 = !lb0;
            fb0 = ld2 < ld3;
            ld1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, fb1, lb0, fb0, fb1);
}
}}
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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought2.getInstance();
    fb1 = !ab1;
    ab2 = !ab3;
        ab4 = !fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[2][7] -= fd1;
    fd0 = fd1 - fd0;
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        Thought lo1 = Thought39.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = fd1 < fd0;

Thought.STACK_COUNTER++;
return ab1;
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
    fb1 = !fb0;
    ad2 *= -1;
    double ld0 = 956.7383634521393;
    Thought lo1 = Thought4.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld0;
    double ld2 = 21.590728715201514;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld3 = 189.61020334786255;
    fb0 = ad3 < ad4;

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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ad3 > ad4;
    boolean lb0 = true;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = lb0 || ab1;
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[2][8] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    double ld1 = 162.82827417304645;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ad1);
}

Thought.STACK_COUNTER++;
return ab1;
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
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    double ld0 = 610.1757935678531;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    double ld2 = 264.6588739579905;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = ld0 < ld2;
    fd0 *= -1;
    fb1 = lb1 && fb0;
if(ao2 != null){
      ao2.m3(fd1, ld0, ld2, fd0, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3();
}
    lb1 = fb0 || fb1;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        lb1 = fd1 < ld0;
if(ao4 != null){
          lb3 = ao4.m2(ld2, fd0, fd1, ld0);
}
        fb0 = ld2 < fd0;
        fb1 = lb1 && lb3;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld2, fd0);
}
        Output.points[3][0] += fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ld0, ld2, fd0, fd1, fb0, fb1, lb1, lb3);
}
        Output.points[3][1] += ld0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb3);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3();
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
if(ao4 != null){
      fb0 = ao4.m2(fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Output.points[3][2] += ad4;
    Output.points[3][3] += fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = true;
    ab2 = !ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld3 = 87.61479635265846;
    double ld4 = 123.12101717950438;
    ld3 *= -1;
    boolean lb5 = false;
    Output.points[3][4] -= ld4;
    Thought lo6 = Thought28.getInstance(fd0, fd1, ld3, ld4, fb0, fb1, lb0, lb1);
    fd0 = fd1 + ld3;
    Thought lo7 = Thought9.getInstance();
    Thought lo8 = Thought16.getInstance(ld4, fd0, fd1, ld3);
if(ao2 != null){
      ao1 = ao2.m4(lb2, lb5, ab1, ab2);
}
    double ld9 = 852.2244042809992;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[3][5] += ad1;
    ab2 = ad2 > ad3;
    Output.points[3][6] -= ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought53.getInstance(fo1, ao1, ao2, ao3);
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao4.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb1) {
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        ab1 = ab2 && ab3;
if(ao1 != null){
          ab4 = ao1.m2(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
          fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
        ad2 = ad3 - ad4;
        boolean lb2 = false;
        fd0 *= -1;
        double ld3 = 42.08106713554997;
        if (ab2) {
            ab3 = fd0 < fd1;
            ab4 = !fb0;
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    double ld0 = 755.5507017120651;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 - fd1;
    Thought lo1 = Thought14.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 5.187591578030563;
    fb1 = ld0 > ld2;
    boolean lb3 = true;
    Thought lo4 = Thought29.getInstance(fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb3);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld2, fd0);
}
    Output.points[3][7] += fd1;
    ld0 *= -1;
    double ld5 = 992.1384564595966;

Thought.STACK_COUNTER++;
return ld2;
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
    fd0 *= -1;
    Output.points[3][8] -= fd1;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought77.getInstance(fb0, fb1, ab1, ab2);
    Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    Output.points[4][0] += fd0;
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    Output.points[4][1] -= fd1;
    double ld3 = 832.8086395730819;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld3;
    fd0 = fd1 - ld3;
    fb1 = lb2 || ab1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 969.8715729326406;
    double ld1 = 631.1718705078401;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
    Output.points[4][2] -= ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld1);
}
    ad1 = ad2 + ad3;
        boolean lb2 = true;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    double ld1 = 669.5371893318412;
    Output.points[4][3] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb2 = fd1 > ld1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    double ld4 = 9.889023312948888;
    double ld5 = 927.55484365509;
    ab4 = fb0 && fb1;
    ad2 = ad3 - ad4;
    lb0 = lb2 && lb3;
    boolean lb6 = true;
    Thought lo7 = Thought95.getInstance(fd0, fd1, ld1, ld4, lb6, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 || fb1;
    lb0 = !lb2;
    boolean lb8 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld5, ad1, ad2, ad3);
}
    lb3 = ad4 > fd0;
    lb6 = !lb8;
    ab1 = ab2 && ab3;

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
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    lb2 = fb0 && fb1;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    Output.points[4][4] += fd1;
    boolean lb3 = true;
    boolean lb4 = false;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, lb2, lb3, lb4, fb0);
}
    Thought lo5 = Thought97.getInstance(fo1, ao1, ao2, ao3);

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
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[4][5] += ad1;
    double ld0 = 552.9203601476746;
    Thought lo1 = Thought32.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2);
}
    fb0 = ad3 < ad4;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;

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
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = fd1 > fd0;
    boolean lb0 = true;
    Output.points[4][6] -= fd1;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought46.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;

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
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    Output.points[4][7] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ad4 > fd0;
    lb0 = fd1 > ad1;
    ad2 *= -1;
    ab1 = ad3 > ad4;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought11.getInstance(lb0, fb0, fb1, lb0);
    Thought lo2 = Thought35.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb3 = true;
    fd0 *= -1;
    boolean lb4 = false;
    boolean lb5 = true;
    lb3 = lb4 && lb5;
    double ld6 = 705.4233735124927;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    lb4 = lb5 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < ld6;
    lb0 = !lb3;
    boolean lb7 = false;
    lb4 = !lb5;
    Thought lo8 = Thought29.getInstance(fd0, fd1, ld6, fd0, lb7, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo9 = Thought28.getInstance(fd1, ld6, fd0, fd1);

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
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    Thought lo2 = Thought53.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    if (lb1) {
        ab1 = fd0 > fd1;
        ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
        lb1 = ab1 || ab2;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb0 = lb1 || ab1;
        fd0 *= -1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
    Thought lo2 = Thought50.getInstance();
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought80.getInstance(fb1, lb0, lb1, fb0);
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    lb0 = lb1 && fb0;
    fd0 = fd1 - ad1;
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
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
    ab2 = ab3 || ab4;
    Output.points[4][8] -= ad2;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + ad1;
    double ld1 = 478.48979778166927;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;

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
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 369.95045155324243;
    double ld1 = 183.31131292001487;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(ao3 != null){
      ld1 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ld1);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    ld0 = ld1 - fd0;
    fb1 = fd1 > ld0;
    fb0 = !fb1;
    fb0 = ld1 < fd0;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 > ld0;
    double ld3 = 500.65109102442756;
    boolean lb4 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    Output.points[5][0] += ad2;
    fb0 = fb1 && lb0;
    Output.points[5][1] -= ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 > fd0;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
    lb0 = lb1 || lb2;
    boolean lb3 = true;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb0);
}
    lb1 = !lb2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2();
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab2 = !ab3;
    fd0 *= -1;
    Thought lo1 = Thought47.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    Thought lo3 = Thought90.getInstance(ab3, ab4, fb0, fb1);
    fd1 = fd0 - fd1;
    double ld4 = 14.772013569408086;
    lb0 = !lb2;
    ld4 *= -1;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    ab4 = !fb0;
    fd1 *= -1;
    fb1 = ld4 < fd0;
    lb0 = fd1 < ld4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0);
}
    lb2 = fd1 < ld4;

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
    ad2 *= -1;
    lb0 = ab1 || ab2;
    Thought lo1 = Thought42.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad2 = ad3 - ad4;
    ab4 = fd0 > fd1;
    fb0 = ad1 > ad2;
        fb1 = !lb0;
    ad3 = ad4 + fd0;
    double ld2 = 107.14817339188248;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[5][2] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld2, ad1, ad2, ad3);
}
    Output.points[5][3] -= ad4;
    Thought lo3 = Thought71.getInstance(fb1, lb0, ab1, ab2);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
    Output.points[5][4] -= fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought24.getInstance(fo1, fo0, fo1, fo0);
    lb0 = !fb0;
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    Thought lo3 = Thought92.getInstance(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
    lb2 = fb0 && fb1;
    fd1 = fd0 + fd1;
    double ld4 = 816.8268727916012;
    ld4 *= -1;
    fd0 *= -1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought36.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fd1 < fd0;
    double ld3 = 999.4326735478613;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2();
}
    lb1 = !fb0;
        boolean lb4 = true;
    fd1 = ld3 - fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought58.getInstance(lb0, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
    Thought lo2 = Thought98.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    double ld3 = 614.28039097487;

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

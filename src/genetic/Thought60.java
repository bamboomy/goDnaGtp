package genetic;
import java.util.ArrayList;
class Thought60 extends Thought{
private static ArrayList<Thought60> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 703.2599857860389;
private double fd1 = 30.483441457811868;
private Thought fo0 = null;
private Thought fo1 = null;
Thought60 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought60 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought60 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 290.32464250324955;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ld0 < fd0;
    fb1 = !fb0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fb1 = fd1 < ld0;
    double ld1 = 862.8131715044973;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    ld1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    ld0 = ld1 - fd0;
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo2 = Thought374.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    Output.points[4][3] += ld0;
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld0);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought114.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    if (ab2) {
        ab3 = ab4 || fb0;
        fd0 = fd1 - fd0;
        fb1 = ab1 && ab2;
        Thought lo1 = Thought251.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo2 = Thought35.getInstance(fd1, fd0, fd1, fd0);
        ab1 = fd1 > fd0;
        Output.points[4][4] += fd1;
        fd0 *= -1;
        ab2 = ab3 || ab4;
        if (fb0) {
            fb1 = ab1 && ab2;
            double ld3 = 200.75912866764696;
if(fo0 != null){
              ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
            double ld4 = 65.95451870004366;
if(fo1 != null){
              fo1.m1(fd0, fd1, ld3, ld4, ab4, fb0, fb1, ab1);
}
            double ld5 = 657.6825195609654;
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1();
}
    Output.points[4][5] += fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb2 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
    boolean lb4 = true;
    lb4 = fb0 && fb1;

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    Thought lo0 = Thought137.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    ab4 = ad4 < fd0;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ad1 = ad2 - ad3;
    Output.points[4][6] -= ad4;
    fd0 *= -1;
    ab2 = ab3 || ab4;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ab2 = !ab3;
    ab4 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    ad3 = ad4 - fd0;

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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought315.getInstance();
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        fd0 = fd1 - fd0;
if(ao1 != null){
          fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fb1 = fb0 || fb1;
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0);
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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ad1 *= -1;
    double ld0 = 109.14698515493237;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb1 = fb0 || fb1;
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ld0, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
    for(int i0=0; i0<10; i0++){
        lb1 = !fb0;
if(ao3 != null){
          fb1 = ao3.m2(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
        boolean lb2 = false;
        for(int i1=0; i1<10; i1++){
            fd1 = ld0 - ad1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
        double ld0 = 242.20093189376874;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        ab2 = fd0 > fd1;
        ab3 = ld0 < fd0;
        ab4 = fb0 && fb1;
        double ld1 = 227.83778603672405;
        ab1 = ab2 || ab3;
        Output.points[4][7] -= fd0;
if(ao1 != null){
          ao1.m3(ab4, fb0, fb1, ab1);
}
        boolean lb2 = true;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        boolean lb3 = true;
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
    ab1 = !ab2;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m3();
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao3.m2(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = !ab1;
    Output.points[4][8] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[5][0] += fd0;
    Thought lo0 = Thought298.getInstance(fd1, ad1, ad2, ad3);
    ab2 = ad4 > fd0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ab3 = ao3.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    ad2 *= -1;

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
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought378.getInstance();
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 920.2963653947187;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !ab1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Thought lo0 = Thought2.getInstance();
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    lb1 = !ab1;
    double ld2 = 19.202118528286377;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
    Thought lo3 = Thought110.getInstance(fo1, fo0, fo1, fo0);
    ab3 = ab4 || fb0;
    fd1 = ld2 + fd0;
    fb1 = lb1 || ab1;
if(fo1 != null){
      fo1.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    boolean lb4 = false;

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
    fb1 = ad2 > ad3;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    Output.points[5][1] += fd0;
    fd1 = ad1 + ad2;
    Thought lo0 = Thought25.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    Thought lo2 = Thought320.getInstance();
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought268.getInstance(fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        Thought lo4 = Thought261.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    boolean lb5 = false;
    fb0 = fb1 && lb1;
    lb5 = fd1 < ad1;
    double ld6 = 171.16793269611426;
    fb0 = fb1 && lb1;
    ad1 = ad2 + ad3;
    boolean lb7 = false;
    boolean lb8 = false;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo9 = Thought298.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld6, ad1, lb5, lb7, lb8, fb0);

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab3) {
        double ld2 = 812.0707560374461;
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo1.m2(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
        boolean lb3 = true;
        ad1 = ad2 + ad3;
        ad4 *= -1;
        Output.points[5][2] -= fd0;
        boolean lb4 = true;
        fd1 = ld2 - ad1;
        boolean lb5 = false;
        ad2 *= -1;
        Thought lo6 = Thought169.getInstance(ad3, ad4, fd0, fd1, lb3, lb4, lb5, lb0);
        lb1 = ab1 || ab2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ld2 = ad1 + ad2;
        Thought lo7 = Thought51.getInstance();
        double ld8 = 876.5381747504879;
        lb3 = ad2 < ad3;
        ad4 = fd0 + fd1;
        boolean lb9 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld8, ad1, ad2, lb4, lb5, lb9, lb0);
}
}
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
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought309.getInstance(ao2, ao3, ao4, fo0);
    double ld1 = 980.0001188977013;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought52.getInstance(ld1, fd0, fd1, ld1);
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought269.getInstance();
    boolean lb4 = true;
    Output.points[5][3] -= fd0;
    if (lb4) {
        fd1 = ld1 - fd0;
        fb0 = fd1 > ld1;
        fd0 = fd1 + ld1;
        fd0 = fd1 - ld1;
        fb1 = fd0 > fd1;
        lb4 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb4, fb0, fb1);
}
        boolean lb5 = true;
if(ao1 != null){
          lb5 = ao1.m2(lb4, fb0, fb1, lb5);
}
        boolean lb6 = false;
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought122.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        double ld1 = 285.3626211604072;
        fb1 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = ad2 < ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
if(ao4 != null){
          ld1 = ao4.m3(fb1, fb0, fb1, fb0);
}
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
    Output.points[5][4] -= fd1;
    Output.points[5][5] -= fd0;
    Output.points[5][6] -= fd1;
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = fd0 < fd1;
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2();
}
    double ld0 = 689.5067762061409;
    fd0 = fd1 - ld0;
    ab4 = fd0 > fd1;

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
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    ad3 = ad4 + fd0;
    boolean lb1 = false;
    fd1 = ad1 + ad2;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    fb0 = ad3 > ad4;
    fb1 = lb0 || lb1;
    lb2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ad3 = ao3.m3();
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb2, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
    ad4 *= -1;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, lb1);
}
    double ld3 = 615.7256302409645;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought133.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
    Output.points[5][7] += fd0;
        fb1 = lb0 || fb0;
    Thought lo2 = Thought47.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    boolean lb3 = false;
    lb0 = fd1 > fd0;
    lb3 = fd1 < fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3();
}
    Output.points[5][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
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
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
        Output.points[6][0] += fd1;
    Output.points[6][1] -= fd0;
    fb1 = fd1 > fd0;
    ab1 = !ab2;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    Output.points[6][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought58.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = fd1 > fd0;
    ab1 = fd1 < fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought75.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    Output.points[6][3] -= ad1;
    Thought lo2 = Thought232.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
    ad1 *= -1;
    fb1 = lb1 || fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Output.points[6][4] += ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;

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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld0 = 800.1514125795895;
    fb0 = fb1 || ab1;
    boolean lb1 = false;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, ab1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ab3 = fo0.m2(ad2, ad3, ad4, fd0);
}
        ab4 = fd1 > ld0;
        ad1 *= -1;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb0 = !fb1;
        lb1 = ld0 > ad1;
        for(int i1=0; i1<10; i1++){
            ab1 = ab2 && ab3;
            ab4 = !fb0;
}}
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought256.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought354.getInstance(ao4, fo0, fo1, ao1);
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought202.getInstance(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
    double ld4 = 519.3854804071922;
    fd0 = fd1 - ld4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld4, lb2, fb0, fb1, lb2);
}
    fd0 = fd1 - ld4;
    double ld5 = 783.9231406186115;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought282.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 486.3829961535042;
    Output.points[6][5] -= ld1;
    Output.points[6][6] -= ad1;
    fb1 = ad2 < ad3;
    boolean lb2 = true;
    Thought lo3 = Thought329.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld1);
}
        lb2 = fb0 || fb1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
        Output.points[6][7] += ad4;
        boolean lb4 = false;
        lb4 = !lb2;
if(ao1 != null){
          fb0 = ao1.m2(fd0, fd1, ld1, ad1, fb1, lb4, lb2, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb4, lb2, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought95.getInstance(ab4, fb0, fb1, lb0);
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought171.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ad1;
    if (ab2) {
if(ao1 != null){
          ab3 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        if (ab4) {
            fd1 = ad1 - ad2;
if(ao1 != null){
              fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
}}
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
      fd1 = fo0.m3();
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo1 != null){
          fo1.m1(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
        double ld0 = 769.6649758103121;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld1 = 200.50943679125913;
        double ld2 = 125.24092080944396;
if(fo0 != null){
          fb1 = fo0.m2(ld1, ld2, fd0, fd1);
}
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo0.m3(ld0, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
}
        double ld3 = 786.6168770789991;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ld0;
if(fo0 != null){
          ld1 = fo0.m3();
}
        fb1 = ld2 < ld3;
        double ld4 = 774.1629099742416;
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
    fd0 = fd1 - fd0;
    double ld0 = 174.72984285941575;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[6][8] -= fd1;
    Thought lo1 = Thought86.getInstance(fb0, fb1, ab1, ab2);
    double ld2 = 184.72639818507983;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        ld0 = ld2 + fd0;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, ld2, fd0);
}
        fd1 = ld0 + ld2;
        fb1 = fd0 > fd1;
        ab1 = !ab2;
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
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb1 = fd0 > fd1;
        ad1 = ad2 - ad3;
        boolean lb0 = true;
        Output.points[7][0] += ad4;
        Output.points[7][1] += fd0;
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo0.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        fb0 = !fb1;
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        Output.points[7][2] += ad4;
        Thought lo1 = Thought237.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
    Thought lo0 = Thought95.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
    if (ab4) {
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1);
}
        double ld1 = 871.9299800426629;
        ld1 = ad1 - ad2;
        fb0 = ad3 > ad4;
        fb1 = fd0 > fd1;
        ld1 *= -1;
        boolean lb2 = true;
        ad1 *= -1;
        lb2 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        Thought lo3 = Thought343.getInstance(fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 288.96216306295327;
    ld0 *= -1;
    double ld1 = 82.2659683338335;
        fb0 = ld1 < ad1;
    ad2 *= -1;
    fb1 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    lb2 = ad1 < ad2;
    fb0 = fb1 && lb2;
    double ld3 = 268.10095209497706;
    double ld4 = 92.22407831570264;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, fb0);
}
    Thought lo5 = Thought330.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Thought lo6 = Thought90.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought274.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      fd0 = ao2.m3(ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab3 = fd0 < fd1;
    Thought lo1 = Thought380.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld2 = 984.8064754869945;
    Output.points[7][3] += ld2;
    boolean lb3 = true;
    Output.points[7][4] -= fd0;
    fd1 = ld2 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb3);
}
if(ao3 != null){
      ab1 = ao3.m2();
}
    ld2 = fd0 + fd1;
    boolean lb4 = false;
        Thought lo5 = Thought339.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ld2;
if(ao2 != null){
          fd0 = ao2.m3(fb0, fb1, lb3, lb4);
}
        double ld6 = 721.0608681670299;
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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought77.getInstance(ao2, ao3, ao4, fo0);
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ab3 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    Output.points[7][5] += ad2;
if(ao4 != null){
      ad3 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought259.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 + ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    lb2 = fd0 > fd1;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    ab4 = fb0 && fb1;
    Thought lo3 = Thought16.getInstance(ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb2, ab1);
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
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 408.1645923603358;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb3, fb0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    Thought lo5 = Thought133.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
    boolean lb6 = false;

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
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
    Output.points[7][6] -= fd0;
    fb0 = fd1 > fd0;
    Thought lo2 = Thought365.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
    fb1 = lb0 && lb1;
    fb0 = !fb1;
    Thought lo3 = Thought225.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    double ld4 = 641.8112293560812;
    boolean lb5 = false;
    Thought lo6 = Thought257.getInstance();
    boolean lb7 = true;
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    Output.points[7][7] -= fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought261.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][8] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[8][0] += fd1;

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

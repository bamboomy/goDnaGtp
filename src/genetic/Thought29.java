package genetic;
import java.util.ArrayList;
class Thought29 extends Thought{
private static ArrayList<Thought29> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 428.87045126051135;
private double fd1 = 603.3824409707605;
private Thought fo0 = null;
private Thought fo1 = null;
Thought29 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought29 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought29 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought29 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought29 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    Thought lo1 = Thought73.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    if (lb0) {
        if (fb0) {
            fb1 = !lb0;
            fd1 = fd0 + fd1;
            fb0 = fd0 < fd1;
            fb1 = fd0 > fd1;
            fd0 = fd1 + fd0;
if(fo1 != null){
              fo1.m1(lb0, fb0, fb1, lb0);
}
            fb0 = !fb1;
            lb0 = fb0 && fb1;
            Output.points[5][4] -= fd1;
if(fo1 != null){
              fo0 = fo1.m4();
}
            lb0 = fd0 < fd1;
            fd0 *= -1;
if(fo0 != null){
              fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
            fb1 = lb0 && fb0;
            } else if (fb1) {
            fd0 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            lb0 = !fb0;
            fd1 = fd0 + fd1;
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
    double ld0 = 378.81113447501554;
    ld0 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought13.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
    fd1 = ld0 + fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    double ld3 = 820.1820049240495;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1);
}
    boolean lb4 = true;
    boolean lb5 = true;
if(fo0 != null){
      lb5 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
    Output.points[5][5] -= ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought36.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    lb1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    ad3 = ad4 + fd0;
    double ld2 = 546.3995494785547;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[5][6] -= ld2;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    ad2 *= -1;
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
        ab1 = !ab2;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          ab1 = fo0.m2(ad3, ad4, fd0, fd1);
}
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        Thought lo1 = Thought13.getInstance(fb0, fb1, lb0, ab1);
        boolean lb2 = true;
        for(int i1=0; i1<10; i1++){
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
    fb0 = !fb1;
    Output.points[5][7] -= fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[5][8] += fd1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao3.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought46.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);

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
    double ld0 = 922.0301528504854;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > ld0;
    fb0 = ad1 > ad2;
    fb1 = !fb0;
    boolean lb1 = false;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    boolean lb2 = false;
    ld0 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb2, fb0, fb1);
}
    lb1 = ad3 > ad4;
    lb2 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    double ld3 = 41.64245963787468;
    Thought lo4 = Thought26.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    fb0 = ld0 < ld3;
    Thought lo5 = Thought77.getInstance(fb1, lb1, lb2, fb0);
    if (fb1) {
if(fo1 != null){
          ad1 = fo1.m3();
}
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        double ld0 = 603.0558582346916;
        fd0 *= -1;
        ab4 = fd1 > ld0;
        fd0 = fd1 + ld0;
        Thought lo1 = Thought11.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
        fd1 = ld0 + fd0;
        ab3 = fd1 < ld0;
        ab4 = fb0 && fb1;
        boolean lb2 = true;
        lb2 = ab1 || ab2;
        }
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb3 = false;
    double ld4 = 691.677878699979;
if(ao4 != null){
      fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
    fd1 = ld4 - fd0;
    Thought lo5 = Thought2.getInstance();
if(fo0 != null){
      fo0.m3(fd1, ld4, fd0, fd1, fb0, fb1, lb3, ab1);
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ab3 = ad1 > ad2;
    if (ab4) {
        fb0 = ad3 > ad4;
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        lb0 = !ab1;
        ab2 = ab3 || ab4;
        double ld1 = 518.8155737062973;
        double ld2 = 561.6801996008071;
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
            fd0 = fd1 - ld1;
            Thought lo3 = Thought42.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    double ld0 = 231.3063720582809;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    Output.points[6][0] -= fd1;
    double ld1 = 136.39987679924235;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
    Output.points[6][1] -= fd0;
    Thought lo2 = Thought25.getInstance(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 + ld1;
        Thought lo3 = Thought81.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ld0;
    boolean lb4 = true;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    fb0 = fd0 > fd1;
    double ld5 = 349.1282333270026;
    double ld6 = 509.62021769085624;
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ld5, ld6);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb4, lb7);
}
    fd0 = fd1 + ld0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb8 = true;
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
    ab2 = fd1 < fd0;
if(fo0 != null){
      ab3 = fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab2 = !ab3;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
        ab2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    lb0 = lb1 || ab1;
    boolean lb2 = false;
    ab1 = fd1 < fd0;
    Thought lo3 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb4 = false;
    boolean lb5 = false;
    for(int i0=0; i0<10; i0++){
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][2] += ad2;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    Thought lo0 = Thought97.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 *= -1;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    fb0 = !fb1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        boolean lb2 = true;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m2(fb1, lb1, lb2, fb0);
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
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 + fd1;
    ab2 = ab3 || ab4;
    boolean lb0 = true;
        Thought lo1 = Thought58.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
    ab1 = fd0 > fd1;
    Thought lo2 = Thought45.getInstance(fo0, fo1, fo0, fo1);
    ab2 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
        boolean lb3 = true;

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
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = lb1 && lb2;
    boolean lb4 = true;
    lb3 = !lb4;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
    lb1 = fd1 > fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought66.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
          ao1 = ao2.m4();
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    double ld2 = 946.5599959493009;
    Output.points[6][3] -= ad4;
    fb0 = fb1 && lb1;

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
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought30.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m2();
}
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought22.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    double ld2 = 657.4653107304609;
    ab4 = fd0 > fd1;
    boolean lb3 = false;
    Output.points[6][4] -= ld2;
    fd0 = fd1 + ld2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb3);
}
    ab1 = ab2 || ab3;
    boolean lb4 = true;
    fd1 = ld2 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Output.points[6][5] -= fd1;

Thought.STACK_COUNTER++;
return lb3;
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
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        boolean lb0 = false;
        ab2 = ad1 > ad2;
        ad3 *= -1;
if(ao2 != null){
          ab3 = ao2.m2(ab4, fb0, fb1, lb0);
}
if(ao3 != null){
          ao3.m1();
}
        ad4 *= -1;
        Thought lo1 = Thought97.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    Thought lo0 = Thought20.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    boolean lb1 = false;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][6] += fd0;
    fd1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 < fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab2 = ab3 || ab4;
    double ld2 = 197.35981607563895;
    Output.points[6][7] += ld2;
    Thought lo3 = Thought56.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
        ab1 = !ab2;
    boolean lb4 = false;

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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        fb0 = !fb1;
    fb0 = ad3 < ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}

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
      ad1 = fo1.m3();
}
    ab1 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ad1 = ad2 - ad3;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought43.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          ab1 = fo0.m2();
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought9.getInstance(fo1, fo0, fo1, fo0);

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
    double ld0 = 333.73980216941294;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Output.points[6][8] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fd1 = ld0 - fd0;
    fb0 = !fb1;
    Thought lo2 = Thought86.getInstance();
    fd1 *= -1;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return ld0;
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
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    fb0 = ad2 < ad3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought33.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
    double ld2 = 289.573533553365;
    double ld3 = 40.9885265764405;
    lb0 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        ld3 = ad1 + ad2;
        ad3 *= -1;
        lb0 = ad4 > fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 < fd1;
if(ao1 != null){
          ab3 = ao1.m2(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        Thought lo0 = Thought16.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
        Thought lo1 = Thought3.getInstance(ab4, fb0, fb1, ab1);
        ab2 = fd1 < fd0;
        boolean lb2 = false;
        ab2 = fd1 < fd0;
        if (ab3) {
            Output.points[7][0] += fd1;
            Output.points[7][1] -= fd0;
            Output.points[7][2] += fd1;
            boolean lb3 = false;
            boolean lb4 = false;
            ab2 = fd0 < fd1;
if(fo1 != null){
              ab3 = fo1.m2();
}
            ab4 = fb0 && fb1;
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb3, lb4, lb2, ab1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    ad2 = ad3 - ad4;
    ab4 = fb0 && fb1;
    fd0 *= -1;
    ab1 = fd1 > ad1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
    ab3 = ad4 < fd0;
    fd1 *= -1;
    if (ab4) {
        fb0 = ad1 < ad2;
        fb1 = !ab1;
        boolean lb0 = true;
        Output.points[7][3] += ad3;
        Thought lo1 = Thought42.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
        fb0 = ad4 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        fb1 = fd0 < fd1;
        lb0 = ab1 && ab2;
if(ao1 != null){
          fo1 = ao1.m4(ab3, ab4, fb0, fb1);
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
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2();
}
    boolean lb0 = false;
    double ld1 = 159.69962590879638;
    fd0 *= -1;
    fd1 = ld1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fd1 = ld1 + fd0;
    Thought lo2 = Thought59.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Output.points[7][4] -= ld1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld1, fd0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
    lb3 = ld1 > fd0;
    lb4 = fb0 && fb1;
    Thought lo5 = Thought28.getInstance();
    fd1 = ld1 + fd0;
    Output.points[7][5] -= fd1;

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
    double ld0 = 7.075184169265771;
    Thought lo1 = Thought52.getInstance(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought80.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 + fd0;
        ab3 = !ab4;
        fb0 = fd1 > ld0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, ld0, fd0);
}
        double ld3 = 434.5258211516013;
        fb0 = fb1 || ab1;
        if (ab2) {
            double ld4 = 884.975129862676;
if(fo0 != null){
              ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld4);
}
            Output.points[7][6] -= ld3;
if(fo0 != null){
              fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
            Thought lo5 = Thought98.getInstance(ld0, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
            ld3 = ld0 - fd0;
            Thought lo6 = Thought22.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld4, ld3, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
            fd0 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fd1, ld4, ld3, ld0);
}
            fd0 = fd1 - ld4;
            Thought lo7 = Thought47.getInstance(fo1, fo0, fo1, fo0, ld3, ld0, fd0, fd1);
            ab4 = !fb0;
}}
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
    double ld0 = 64.09204405131958;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
}
    if (fb0) {
        double ld1 = 652.9753254662145;
        fb1 = ld1 > ld0;
        fb0 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        double ld2 = 605.0516594394761;
        fb1 = fb0 || fb1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && fb0;
        boolean lb3 = true;
        ld2 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb1, lb3, fb0, fb1);
}
        ad4 *= -1;
        double ld4 = 984.9959623941556;
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
        fb0 = fb1 && lb3;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld2, ld4, ld0);
}
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
    ad1 = ad2 - ad3;
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought89.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][7] += ad3;
    double ld1 = 356.23276750225705;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought61.getInstance(fo0, fo1, fo0, fo1);
    ld1 = ad1 - ad2;
    Thought lo3 = Thought6.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ld1 < ad1;
    ad2 = ad3 + ad4;
    boolean lb4 = true;

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
    fd1 *= -1;
    fb0 = fb1 || fb0;
        fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    boolean lb1 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 60.75473600174012;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao4.m3(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought96.getInstance(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    boolean lb2 = false;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ad1);
}
    Thought lo3 = Thought34.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    fb1 = fd1 > ld0;
if(ao1 != null){
      ao1.m1(lb2, fb0, fb1, lb2);
}
    Thought lo4 = Thought48.getInstance();
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    Output.points[7][8] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2();
}
    fb1 = ab1 && ab2;
    ab3 = ad2 < ad3;
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld0 = 194.3461332703676;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2);
}
    Output.points[8][0] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ld0;
    Thought lo1 = Thought69.getInstance();
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    Thought lo2 = Thought37.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);

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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
              fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    Output.points[8][1] -= fd1;
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    double ld2 = 791.7905695118251;
    lb1 = !fb0;
    fb1 = ld2 > fd0;

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
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought27.getInstance();
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought90.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    Thought lo3 = Thought9.getInstance(fd1, fd0, fd1, fd0);
    Thought lo4 = Thought66.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld3 = 678.8385635297778;
    lb0 = !lb1;
    ld3 = fd0 - fd1;
    Thought lo4 = Thought87.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);

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

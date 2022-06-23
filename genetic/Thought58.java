package genetic;
import java.util.ArrayList;
class Thought58 extends Thought{
private static ArrayList<Thought58> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 407.1483087049152;
private double fd1 = 231.42257433514442;
private Thought fo0 = null;
private Thought fo1 = null;
Thought58 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought58 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought58 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought58 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought58 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[6][8] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
    lb1 = fd0 > fd1;

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[7][0] += fd0;
    fd1 *= -1;
        Output.points[7][1] -= fd0;
    ab2 = !ab3;
    Thought lo0 = Thought95.getInstance(ab4, fb0, fb1, ab1);
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb1 = false;
    fd1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = fd0 < fd1;
    Thought lo2 = Thought99.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    Thought lo3 = Thought56.getInstance(fo1, fo0, fo1, fo0);
    lb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    double ld2 = 595.396921170443;
    ld2 = ad1 - ad2;
    double ld3 = 388.5880125211536;
    Output.points[7][2] -= ad2;
    ad3 *= -1;
    lb0 = ad4 < fd0;
    lb1 = fd1 > ld2;
    ld3 = ad1 + ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ld2 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought57.getInstance(fo1, fo0, fo1, fo0);
    fb0 = ad4 > fd0;
    fb1 = lb0 && lb1;

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
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought61.getInstance(fb0, fb1, ab1, ab2);
    Thought lo1 = Thought62.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2();
}
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
        Output.points[7][3] += fd1;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought92.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
    fb0 = fb1 || ab1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 240.159343491813;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][4] += fd1;
    Output.points[7][5] += ld0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought25.getInstance(fb1, fb0, fb1, fb0);
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    double ld3 = 296.31320362044;
if(ao4 != null){
      ao4.m3(fd0, fd1, ld0, ld3, fb0, fb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo4 = Thought89.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld3, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    ld0 = ld3 - fd0;

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
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought60.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
        Output.points[7][6] += fd1;
        boolean lb1 = false;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
        lb1 = fd0 > fd1;
        ad1 = ad2 - ad3;
        }
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
        for(int i1=0; i1<10; i1++){
        double ld3 = 115.97117121979397;
        }
    fb1 = fd0 > fd1;

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
    ab1 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab2 = ab3 && ab4;
    double ld0 = 768.578585142287;
        fb0 = fd0 < fd1;
    if (fb1) {
if(ao2 != null){
          ab1 = ao2.m2(ld0, fd0, fd1, ld0);
}
        Output.points[7][7] += fd0;
if(ao3 != null){
          ao3.m1(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        ab3 = fd1 < ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        Output.points[7][8] -= fd0;
        boolean lb1 = true;
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 || ab1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        ab2 = fd1 > ld0;
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
    boolean lb0 = true;
    ab4 = ad2 > ad3;
    double ld1 = 923.481195526817;
    fb0 = ad3 > ad4;
    Output.points[8][0] += fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[8][1] += fd1;
        Output.points[8][2] += ld1;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
if(fo0 != null){
          fo0.m1();
}
        fd1 *= -1;
        double ld0 = 231.27176885588486;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
            Output.points[8][3] += fd1;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
            fb0 = fd0 < fd1;
            boolean lb1 = true;
            fb0 = fb1 && lb1;
            fb0 = ld0 > fd0;
            double ld2 = 80.89007302188104;
            fd0 = fd1 + ld2;
            ld0 = fd0 - fd1;
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1);
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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[8][4] -= fd0;
        fb0 = fb1 && lb0;
        boolean lb1 = false;
        }
    ab1 = !ab2;
    Output.points[8][5] += fd1;
    boolean lb2 = false;
    ab2 = fd0 > fd1;
    Thought lo3 = Thought16.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Output.points[8][6] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, ab1, ab2);
}
    Thought lo4 = Thought71.getInstance(fo1, fo0, fo1, fo0);
    ab3 = !ab4;

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
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    fb0 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought80.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ad1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 845.5478723818029;
        fb0 = ad1 > ad2;
    ad3 *= -1;
    Thought lo3 = Thought60.getInstance(ad4, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought31.getInstance(ad1, ad2, ad3, ad4);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld2;
    ad1 = ad2 - ad3;
    boolean lb5 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
}
    fb1 = !lb5;
    Thought lo6 = Thought36.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb5, fb0);

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = ad2 < ad3;
        Thought lo0 = Thought53.getInstance(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1);
}
        ab4 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        boolean lb1 = false;
        ab2 = !ab3;
        double ld2 = 11.570709788312438;
        ad2 *= -1;
        Thought lo3 = Thought98.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
        ld2 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fd0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
        } else {
        Output.points[8][7] -= fd1;
        Output.points[8][8] += fd0;
        fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
        fd0 *= -1;
if(ao2 != null){
          ao2.m2();
}
        boolean lb0 = false;
if(ao3 != null){
          ao3.m1(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
        double ld1 = 669.5654636684862;
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
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought6.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    double ld2 = 739.2481096554009;
    fb0 = fb1 && fb0;
    boolean lb3 = false;
    double ld4 = 854.69723997612;
    Output.points[0][0] += ad2;
    double ld5 = 130.32795300822448;
    ad2 *= -1;
    double ld6 = 496.79779156418186;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb3, fb0, fb1);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb7 = false;

Thought.STACK_COUNTER++;
return lb7;
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
    boolean lb1 = true;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m2();
}
    if (lb1) {
        Output.points[0][1] += fd1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ad1 > ad2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld1 = 793.7083458395674;
    ad4 *= -1;
    double ld2 = 378.96166074009005;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
    ad4 *= -1;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, ld2, ad1, ad2, fb0, fb1, lb0, ab1);
}
    boolean lb3 = false;
    ab1 = ad3 > ad4;
    ab2 = fd0 > fd1;
    ab3 = ld1 > ld2;
    ab4 = ad1 > ad2;
    Output.points[0][2] += ad3;
    ad4 *= -1;
    Thought lo4 = Thought40.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ld2, ad1);
}
    Thought lo5 = Thought74.getInstance(fb0, fb1, lb0, lb3);

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
    fd1 = fd0 + fd1;
    double ld0 = 185.0170272869983;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
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
    Thought lo0 = Thought13.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought59.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    ab4 = fd0 > fd1;
    boolean lb2 = false;
    double ld3 = 290.358390767146;
    ab4 = fb0 && fb1;
    Output.points[0][3] -= ld3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
    ld3 = fd0 + fd1;
    boolean lb4 = true;
    lb4 = !ab1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld3;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld3, fd0, fb1, lb2, lb4, ab1);
}
    fd1 = ld3 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld5 = 539.5755075124341;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld3);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 187.2661196996485;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
        Output.points[0][4] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    double ld1 = 521.0215359135194;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ab1 = ad4 < fd0;
    boolean lb2 = false;
    ab1 = ab2 || ab3;
    fd1 = ld1 + ad1;
    double ld3 = 701.5983484187714;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab1 = ad1 > ad2;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
        Thought lo4 = Thought21.getInstance();
        fb1 = !lb0;
        boolean lb5 = true;
if(fo1 != null){
          lb0 = fo1.m2(ld3, ad1, ad2, ad3);
}
if(fo0 != null){
          ad4 = fo0.m3(lb2, ab1, ab2, ab3);
}
        Output.points[0][5] -= fd0;
        ab4 = fb0 || fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought54.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
    double ld2 = 623.9033092532162;
    fd0 = fd1 + ld2;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought72.getInstance(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
    fb0 = fd0 < fd1;
    fb1 = ld2 > fd0;
    boolean lb4 = false;
    lb1 = !lb4;
    Output.points[0][6] -= fd1;
if(fo0 != null){
      fo0.m1();
}
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, lb4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0);
}
    boolean lb5 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 167.23182871009791;
    ld0 = ad1 + ad2;
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 117.59408008075835;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      ab4 = fo1.m2();
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
    Thought lo0 = Thought25.getInstance(ad2, ad3, ad4, fd0);
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 *= -1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    boolean lb3 = true;
    Thought lo4 = Thought60.getInstance(ao1, ao2, ao3, ao4, lb3, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb5 = true;
    ab3 = !ab4;
    Thought lo6 = Thought72.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
if(ao4 != null){
      lb3 = ao4.m2();
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    double ld7 = 375.4575063902029;
if(fo1 != null){
      lb5 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld7, ad1, fb0, fb1, lb1, lb2);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, lb3, lb5, ab1, ab2);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    Output.points[0][7] += fd0;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought27.getInstance();
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb2, lb3, fb0);
}
    Output.points[0][8] += fd0;
    if (fb1) {
        boolean lb4 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb4, lb0, lb2, lb3);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        fb0 = fd1 > fd0;
        fd1 *= -1;
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb4, lb0, lb2, lb3);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[1][0] -= fd1;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
    fb1 = lb0 || ab1;
    boolean lb1 = true;
    ab1 = !ab2;

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
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = ad3 > ad4;
    boolean lb0 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = fd1 < ad1;
    fb0 = !fb1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
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
    Thought lo0 = Thought99.getInstance();
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    double ld1 = 231.2136907051634;
    fd0 = fd1 - ld1;
    double ld2 = 492.4437330158414;
    Thought lo3 = Thought76.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
    Output.points[1][1] += ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    double ld4 = 616.3536153839619;
    fb0 = fb1 || ab1;
    double ld5 = 45.66678863056195;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
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
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 167.279281223322;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      fb0 = ao4.m2(ld0, fd0, fd1, ld0);
}
    fb1 = fd0 > fd1;
    if (fb0) {
if(fo0 != null){
          fo0.m3(fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
        fb0 = fd0 < fd1;
        boolean lb2 = false;
        fb0 = ld0 < fd0;
        fb1 = !lb1;
        fd1 = ld0 + fd0;
        lb2 = fd1 > ld0;
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
        double ld3 = 309.3815918643529;
        lb1 = lb2 && fb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, lb2, fb0);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        Output.points[1][2] -= fd1;
if(ao3 != null){
          fb1 = ao3.m2(ld3, ld0, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        lb1 = !lb2;
        boolean lb4 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    lb0 = fd0 < fd1;
if(ao3 != null){
      ad1 = ao3.m3(lb1, fb0, fb1, lb0);
}
    ad2 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Output.points[1][3] -= ad4;
    lb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    ad2 = ad3 - ad4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fb0 = fb1 && lb0;

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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
    Output.points[1][4] += fd1;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(lb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = lb0 && lb1;
    lb2 = !ab1;

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
    ab1 = ad1 < ad2;
    Thought lo0 = Thought34.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = ab2 || ab3;
        fd1 = ad1 + ad2;
if(fo0 != null){
          ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ab3 = !ab4;
        fb0 = fb1 && ab1;
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ad1 > ad2;
        ab1 = ad3 > ad4;
if(fo1 != null){
          ab2 = fo1.m2();
}
        Thought lo1 = Thought27.getInstance(fd0, fd1, ad1, ad2);
        ab3 = ad3 < ad4;
        Thought lo2 = Thought15.getInstance(ab4, fb0, fb1, ab1);
        fd0 *= -1;
        Thought lo3 = Thought38.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
        Thought lo4 = Thought21.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
        boolean lb5 = true;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb5, ab1);
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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 461.68250976209225;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought12.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][5] += fd0;
    boolean lb1 = true;
    lb0 = fd1 > fd0;
        double ld2 = 140.94953059883755;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      ld2 = fo1.m3(lb1, lb3, fb0, fb1);
}
    lb0 = lb1 || lb3;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    lb1 = !lb3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
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

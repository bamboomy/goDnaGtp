package genetic;
import java.util.ArrayList;
class Thought27 extends Thought{
private static ArrayList<Thought27> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 106.20785929979529;
private double fd1 = 518.8070743048683;
private Thought fo0 = null;
private Thought fo1 = null;
Thought27 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought27 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought27 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < fd0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb1 = !fb0;
        boolean lb0 = false;
        double ld1 = 925.3604672109111;
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
        fd1 = ld1 + fd0;
        boolean lb2 = true;
        fb0 = fb1 || lb0;
        boolean lb3 = true;
        if (lb2) {
            lb3 = fb0 && fb1;
            Thought lo4 = Thought82.getInstance();
            fd1 = ld1 - fd0;
            Output.points[7][7] += fd1;
            lb0 = !lb2;
            Output.points[7][8] -= ld1;
            lb3 = fb0 && fb1;
if(fo0 != null){
              fo0.m2(fd0, fd1, ld1, fd0, lb0, lb2, lb3, fb0);
}
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
            fb1 = ld1 < fd0;
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought84.getInstance(fd1, fd0, fd1, fd0);
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb2 = true;
        if (ab2) {
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
            boolean lb3 = true;
            boolean lb4 = false;
            lb3 = lb4 || lb1;
            lb2 = !ab1;
            ab2 = fd0 > fd1;
            Output.points[8][0] -= fd0;
if(fo0 != null){
              ab3 = fo0.m2();
}
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb3);
}
            Thought lo5 = Thought85.getInstance(fo0, fo1, fo0, fo1);
            lb4 = fd0 > fd1;
            double ld6 = 732.6669267659032;
            ld6 = fd0 - fd1;
            boolean lb7 = true;
            } else if (ab1) {
if(fo0 != null){
              ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
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
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 460.4083884502353;
    double ld1 = 299.8626522181021;
    Thought lo2 = Thought38.getInstance(ld0, ld1, ad1, ad2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo1 != null){
      ld1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought44.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    fb1 = ad4 > fd0;

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
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = true;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ad3 = ad4 + fd0;
    boolean lb1 = false;
    ab1 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld4 = 534.4467212567146;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
        boolean lb5 = true;
    fd1 = ld4 + ad1;

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
        for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought42.getInstance(ao1, ao2, ao3, ao4);
        fb1 = !fb0;
        Thought lo1 = Thought30.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        }
    boolean lb2 = false;
    double ld3 = 312.9229102268038;
    ld3 = fd0 + fd1;

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
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
        fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
    Output.points[8][1] += ad4;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo0 = Thought19.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    boolean lb1 = true;

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
    if (ab2) {
if(ao2 != null){
          fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        boolean lb0 = true;
if(ao4 != null){
          ao3 = ao4.m4();
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
            boolean lb1 = false;
            lb1 = fd0 > fd1;
            lb0 = fd0 > fd1;
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4);
}
            fd0 = fd1 + fd0;
            }
        boolean lb2 = false;
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > fd0;
        } else {
        ab1 = ab2 || ab3;
if(ao4 != null){
          ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
        fd1 *= -1;
if(ao3 != null){
          ao3.m1(fd0, fd1, fd0, fd1);
}
                double ld3 = 683.07371735692;
        for(int i1=0; i1<10; i1++){
            ld3 = fd0 + fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(ao4 != null){
      fb0 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    double ld1 = 203.49764784079014;
    Thought lo2 = Thought30.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought26.getInstance(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought92.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1);
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fd1 = ld1 - ad1;

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
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 205.35217404298507;
    fb1 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    double ld1 = 567.695196775238;
    fd0 = fd1 - ld0;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought86.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    Output.points[8][2] += ld1;
    double ld3 = 140.17462056112976;

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
    ab2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    double ld1 = 675.8859728704775;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Output.points[8][3] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    ab3 = ab4 || fb0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, lb2, lb3, ab1);
}
        fd1 *= -1;
        ab2 = ld1 > fd0;
        } else if (ab3) {
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
          fo1.m2(fd1, ld1, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
            }
        boolean lb4 = true;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        lb3 = ab1 || ab2;
        ab3 = ab4 && fb0;
        boolean lb5 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought0.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    fb1 = ad2 > ad3;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought70.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, lb2, lb3, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    Thought lo0 = Thought69.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[8][4] -= fd0;
        fd1 = ad1 + ad2;
    Thought lo1 = Thought91.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    Thought lo2 = Thought2.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab3 = ab4 || fb0;

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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought27.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld1 = 271.45676080875967;
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;
    fb0 = !fb1;
    fd0 *= -1;
    Output.points[8][5] -= fd1;
    ld1 *= -1;
        fb0 = fd0 < fd1;
    ld1 = fd0 - fd1;
    fb1 = ld1 < fd0;
    boolean lb2 = true;
    double ld3 = 846.3223731557665;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    lb2 = fb0 || fb1;
        lb2 = fd0 > fd1;

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
    if (fb0) {
        boolean lb0 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        fd0 = fd1 + ad1;
        for(int i0=0; i0<10; i0++){
            boolean lb1 = false;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb0);
}
if(ao1 != null){
              ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
            Thought lo2 = Thought37.getInstance(fb0, fb1, lb1, lb0);
            fb0 = fb1 && lb1;
if(ao2 != null){
              ao2.m1();
}
if(ao3 != null){
              ao3.m2(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb1);
}
            ad2 = ad3 - ad4;
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2);
}
            fd0 = fd1 + ad1;
            lb0 = !fb0;
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb1, lb0, fb0);
}
            fb1 = lb1 || lb0;
            boolean lb3 = false;
if(ao2 != null){
              fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb1);
}
if(ao2 != null){
              ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
            lb3 = fd0 > fd1;
            lb0 = ad1 > ad2;
            ad3 = ad4 - fd0;
            fb0 = fb1 && lb1;
            lb3 = !lb0;
            fb0 = fb1 && lb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought68.getInstance();
    fd1 = fd0 + fd1;
    Thought lo1 = Thought9.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = ab4 || fb0;
    Thought lo2 = Thought58.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
    Thought lo3 = Thought23.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    double ld4 = 880.497522117941;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[8][6] -= fd1;
        }
    fb1 = ab1 && ab2;
    boolean lb5 = true;
    ld4 *= -1;
if(ao4 != null){
      ao4.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 + ld4;
    fd0 = fd1 - ld4;
    double ld6 = 791.9870515853601;

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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo0 = Thought28.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    boolean lb1 = false;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought56.getInstance(ad4, fd0, fd1, ad1);
    lb1 = !ab1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    boolean lb4 = true;
    ad1 *= -1;
    boolean lb5 = false;
    Thought lo6 = Thought96.getInstance();
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
    lb3 = lb4 && lb5;
    ab1 = fd1 > ad1;
    double ld7 = 251.58414020498216;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, lb3, lb4);
}
    fd0 = fd1 + ld7;
if(ao2 != null){
      lb5 = ao2.m2(ad1, ad2, ad3, ad4);
}
    boolean lb8 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld7, ad1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      fd0 = ao3.m3(lb8, ab1, ab2, ab3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
        fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
        lb0 = lb1 || fb0;
    boolean lb2 = false;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
        fd0 = fd1 - fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb0);
}
    double ld5 = 703.9834177909286;
    lb1 = lb2 && lb3;

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
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (ab3) {
        fd1 = fd0 + fd1;
        ab4 = !fb0;
        fb1 = fd0 > fd1;
        lb0 = fd0 < fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought74.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
    Thought lo2 = Thought2.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    Thought lo3 = Thought11.getInstance(fo1, fo0, fo1, fo0);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[8][7] -= fd1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[8][8] += fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    ab1 = ad1 > ad2;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ab4 = fb0 || fb1;
    ad3 *= -1;
    lb0 = ab1 && ab2;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo1 != null){
      ab1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought67.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb4 = false;
    boolean lb5 = true;
    fd1 *= -1;
    Thought lo6 = Thought77.getInstance();

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
    Thought lo0 = Thought52.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
    Output.points[0][0] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb1 = !fb0;
    fd1 = fd0 - fd1;
        Output.points[0][1] += fd0;
    fd1 = fd0 - fd1;
    fb1 = !lb1;
    fb0 = fb1 || lb1;

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
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    if (fb0) {
        boolean lb0 = true;
        ad4 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Thought lo1 = Thought56.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
        lb0 = ad3 < ad4;
        fb0 = fd0 > fd1;
        fb1 = ad1 < ad2;
        lb0 = ad3 < ad4;
        fd0 *= -1;
        boolean lb2 = false;
        for(int i0=0; i0<10; i0++){
            lb2 = !fb0;
            fb1 = !lb0;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    double ld0 = 958.0883183182939;
    Thought lo1 = Thought24.getInstance(fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ao4.m1(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld2 = 555.8400986886415;
    ab1 = ab2 || ab3;
    double ld3 = 304.46553794238633;
    ld2 = ld3 + fd0;
    ab4 = fb0 || fb1;

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
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        fd1 *= -1;
        fb0 = ad1 < ad2;
        boolean lb1 = false;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb1, lb0, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo1.m2(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2();
}
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ad1, lb1, lb0, ab1, ab2);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought64.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        if (fb1) {
if(fo1 != null){
          fo1.m2(fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
        fb1 = fd1 < fd0;
        fb0 = !fb1;
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld1 = 910.9482874846325;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought81.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought79.getInstance(ab1, ab2, ab3, ab4);
    fd1 = fd0 + fd1;
    boolean lb4 = true;

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
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    if (fb1) {
        ad1 = ad2 + ad3;
        fb0 = fb1 || fb0;
        Thought lo0 = Thought61.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought36.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        Thought lo2 = Thought39.getInstance(ad2, ad3, ad4, fd0);
        Thought lo3 = Thought93.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
        fb0 = ad4 > fd0;
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        ad3 *= -1;
        fb1 = ad4 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = ad1 > ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        double ld4 = 654.9175452835018;
        Thought lo5 = Thought64.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, ad1, ad2);
}
        } else {
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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    double ld0 = 143.11788771492706;
    ad1 *= -1;
    boolean lb1 = true;
    boolean lb2 = false;
    Output.points[0][2] += ad2;
if(fo0 != null){
      fo0.m3(lb1, lb2, ab1, ab2);
}
    ad3 = ad4 + fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2();
}
    boolean lb4 = false;
    Output.points[0][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    boolean lb5 = false;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought36.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
    double ld7 = 258.12326431335924;
    lb2 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb4, lb5, ab1);
}
    Thought lo8 = Thought92.getInstance(fd0, fd1, ld0, ld7);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo9 = Thought86.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 + ld0;
    boolean lb10 = false;
    double ld11 = 741.5937175552297;

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
      ao1 = ao2.m4();
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
        double ld0 = 392.13644589887224;
    fd0 = fd1 + ld0;
    Output.points[0][4] += fd0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ld0 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought45.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
        fb0 = fd1 > ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    if (fb0) {
        Thought lo1 = Thought23.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb0 = !fb1;
        ad1 *= -1;
        fb0 = fb1 || fb0;
        for(int i0=0; i0<10; i0++){
            ad2 = ad3 + ad4;
            boolean lb2 = false;
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb2, fb0);
}
            double ld3 = 35.297068738510674;
            fb1 = !lb2;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1);
}
            Output.points[0][5] -= ad2;
            fb0 = !fb1;
            ad3 *= -1;
            Output.points[0][6] += ad4;
}}
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    double ld0 = 806.0373489391822;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m2(ld0, fd0, fd1, ld0);
}
    double ld1 = 275.6223042544651;
    Thought lo2 = Thought42.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0);
    Thought lo3 = Thought28.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    double ld4 = 378.34813835155484;
    boolean lb5 = false;
    boolean lb6 = false;
    ld0 = ld1 + ld4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo7 = Thought76.getInstance(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld0, fb1, lb5, lb6, ab1);
    Thought lo8 = Thought92.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    boolean lb9 = false;
    ld1 = ld4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ld4);
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
    boolean lb0 = true;
    ab1 = ad2 > ad3;
    ab2 = ab3 && ab4;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    Output.points[0][7] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    ab1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab2 = fd1 < ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
    lb0 = ab1 && ab2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;

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
    fd0 *= -1;
    Thought lo0 = Thought62.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought13.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
        fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;

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
    fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3();
}
    Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
        fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    Thought lo2 = Thought68.getInstance(fb0, fb1, lb1, fb0);

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][8] -= fd0;
    double ld0 = 967.2955613091998;
    Thought lo1 = Thought7.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && fb0;

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

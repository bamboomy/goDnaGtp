package genetic;
import java.util.ArrayList;
class Thought64 extends Thought{
private static ArrayList<Thought64> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 366.9797530179963;
private double fd1 = 112.34376368198112;
private Thought fo0 = null;
private Thought fo1 = null;
Thought64 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought64 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought64 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought64 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought64 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought64 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought64 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought64 instance = new Thought64 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    Thought lo1 = Thought60.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo2 = Thought0.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
        fb1 = !lb0;
        Output.points[5][7] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        Output.points[5][8] -= fd1;
        fb0 = fd0 < fd1;
        fb1 = lb0 || fb0;
        double ld3 = 262.15707933142056;
        }
    if (fb1) {
        double ld4 = 252.0516630004535;
        lb0 = ld4 > fd0;
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
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[6][0] += fd0;
    Output.points[6][1] -= fd1;
    boolean lb3 = false;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, lb1, lb2, lb3, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, ab1, ab2);
}
    Thought lo4 = Thought58.getInstance(fd0, fd1, fd0, fd1);
    ab3 = fd0 < fd1;
    boolean lb5 = false;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    Thought lo7 = Thought72.getInstance();
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, lb2, lb3, lb5, lb6);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;

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
        fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    if (fb1) {
        boolean lb0 = true;
        Output.points[6][2] += fd0;
        fd1 = ad1 - ad2;
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
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought56.getInstance();
    lb0 = ab1 && ab2;
    boolean lb2 = true;
    ad1 *= -1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
        fd1 *= -1;
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
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = true;
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
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
        fb0 = fb1 || fb0;
        fb1 = !fb0;
if(ao2 != null){
          ad1 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
        Output.points[6][3] -= ad4;
        Thought lo0 = Thought46.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        Output.points[6][4] -= ad1;
        fb0 = ad2 < ad3;
        ad4 *= -1;
if(ao4 != null){
          fd0 = ao4.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ad1;
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
    Thought lo0 = Thought68.getInstance();
    Output.points[6][5] += fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    fd1 *= -1;
    ab4 = fb0 && fb1;
    if (ab1) {
        boolean lb1 = true;
        Thought lo2 = Thought5.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
}
        Thought lo3 = Thought55.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        ab2 = !ab3;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ao4 = fo0.m4(ab4, fb0, fb1, lb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 526.6680210239392;
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
if(ao2 != null){
      ab4 = ao2.m2();
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    ad3 *= -1;
    Output.points[6][6] -= ad4;
    fd0 *= -1;
    double ld1 = 974.645678310006;
    fd0 *= -1;
    boolean lb2 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ad1, fb1, lb2, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 || ab3;
    boolean lb3 = true;
    ab3 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld0, ld1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m2(ab4, fb0, fb1, lb2);
}
    lb3 = !ab1;
    ab2 = fd0 > fd1;

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
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 290.7967058817922;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[6][7] += fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 > ld0;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
        fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
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
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 664.34384504295;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought59.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    fd1 = ld0 - fd0;
if(fo0 != null){
          fo0.m2(fd1, ld0, fd0, fd1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    fd1 = ld0 + fd0;
    boolean lb3 = false;

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
    fb1 = fb0 || fb1;
    double ld0 = 955.1007319475736;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad1 *= -1;
    if (fb0) {
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 + ad1;
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
        fb0 = ad2 < ad3;
        double ld2 = 537.4141022405233;
        Output.points[6][8] += ad3;
if(fo1 != null){
          fb1 = fo1.m2(ad4, fd0, fd1, ld2);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        boolean lb3 = false;
        lb1 = lb3 && fb0;
        Thought lo4 = Thought82.getInstance(fb1, lb1, lb3, fb0);
        fb1 = !lb1;
        fd0 = fd1 + ld2;
        ld0 = ad1 - ad2;
        lb3 = ad3 < ad4;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 = fd1 - ld2;
        Thought lo5 = Thought33.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, lb1, lb3);
        Output.points[7][0] += ad4;
        fd0 = fd1 + ld2;
        Output.points[7][1] -= ld0;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 625.1096587750562;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2);
}
    ab2 = ab3 && ab4;
    Output.points[7][2] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3();
}
    Output.points[7][3] += ad1;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought73.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    boolean lb2 = true;
if(fo0 != null){
      ld0 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    ad1 *= -1;
    boolean lb3 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
          fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    if (fb0) {
        fb1 = fd0 < fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 - fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
        Thought lo1 = Thought83.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
          fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
        Output.points[7][4] -= fd0;
        boolean lb2 = false;
        boolean lb3 = false;
        Thought lo4 = Thought80.getInstance();
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
    Thought lo0 = Thought20.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    Thought lo1 = Thought84.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[7][5] += ad2;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
        double ld2 = 663.5348409791673;
if(ao4 != null){
      ao3 = ao4.m4(ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought93.getInstance(fo0, fo1, ao1, ao2);

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    double ld1 = 610.2268981481893;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought67.getInstance(ld1, fd0, fd1, ld1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    Output.points[7][6] -= fd1;
    ld1 = fd0 - fd1;
    double ld3 = 979.3949292900496;
    lb0 = ld1 > ld3;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(fd1, ld1, ld3, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought88.getInstance(ao4, fo0, fo1, ao1);

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
    double ld0 = 602.3958243776679;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    double ld2 = 900.3793506406332;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ld2);
}
    ab1 = !ab2;
    Output.points[7][7] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    ab3 = ab4 && fb0;
    fb1 = !lb1;
if(ao3 != null){
      ao3.m1(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo0 != null){
      fo0.m1(ld0, ld2, ad1, ad2, fb0, fb1, lb1, ab1);
}
    double ld3 = 787.6915957325913;
    ab2 = ab3 && ab4;
    fb0 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ld2 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        Thought lo4 = Thought25.getInstance(ld3, ad1, ad2, ad3);
if(fo0 != null){
          ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    double ld0 = 235.30206603932112;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Output.points[7][8] -= fd0;
    fb1 = fb0 || fb1;
    Output.points[8][0] += fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
    if (fb1) {
        } else if (fb0) {
        fd0 *= -1;
        fb1 = fd1 < ld0;
        Thought lo1 = Thought23.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        Output.points[8][1] += fd0;
        } else if (fb0) {
        fb1 = fb0 || fb1;
        fd1 = ld0 - fd0;
        fb0 = fd1 > ld0;
        boolean lb2 = false;
        fb0 = fb1 && lb2;
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
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
        boolean lb1 = false;
    fd0 = fd1 - fd0;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    ab2 = ab3 || ab4;
    boolean lb2 = true;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - fd0;
    lb2 = !lb3;

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
    Output.points[8][2] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    double ld0 = 889.0815060210243;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        ad4 = fd0 - fd1;
if(fo0 != null){
          ld0 = fo0.m3(fb0, fb1, lb1, fb0);
}
        ad1 *= -1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 > ad3;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought84.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    boolean lb1 = true;
    fd0 *= -1;
    Thought lo2 = Thought40.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = fd1 < ad1;
    lb1 = ab1 || ab2;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[8][3] -= fd0;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    double ld3 = 956.0135375076825;
    Thought lo4 = Thought77.getInstance();
        lb1 = ab1 && ab2;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 862.6331902256234;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought98.getInstance(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
    Output.points[8][4] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    Thought lo3 = Thought67.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    double ld4 = 672.0192030629756;
        boolean lb5 = true;
    Output.points[8][5] += fd0;
    Thought lo6 = Thought3.getInstance();

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + ad1;
    double ld0 = 324.4228002679141;
    if (fb0) {
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Output.points[8][6] -= fd0;
        for(int i0=0; i0<10; i0++){
            boolean lb1 = true;
            lb1 = fb0 || fb1;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
            fb0 = fb1 && lb1;
            fb0 = fb1 || lb1;
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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    double ld0 = 809.1378416149558;
    fb1 = ab1 && ab2;
    double ld1 = 653.679284416857;
    ab3 = ld1 < fd0;
    ab4 = fb0 && fb1;
        ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Output.points[8][7] -= fd1;
    ld0 = ld1 - fd0;
    ab1 = ab2 && ab3;
    fd1 = ld0 - ld1;
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    ab1 = fd0 < fd1;
    double ld3 = 914.6556389069409;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought14.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    ab4 = !fb0;
    double ld2 = 504.84017082955023;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld2 = ad1 - ad2;
    fb0 = fb1 || lb1;
    boolean lb4 = true;
    double ld5 = 312.9690518332979;
    lb3 = lb4 || ab1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld5, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    double ld6 = 636.575178545243;
    ad2 = ad3 + ad4;

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
    double ld0 = 428.4615915143375;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought48.getInstance(ld0, fd0, fd1, ld0);
    Thought lo2 = Thought10.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[8][8] += ld0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < ld0;
    boolean lb3 = true;
    fb0 = fb1 && lb3;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb3, fb0, fb1);
}
    Output.points[0][0] += fd0;
    lb3 = fb0 && fb1;
        fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
        fd1 = ld0 + fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld4 = 726.222355595847;
        fb0 = !fb1;
        lb3 = fb0 || fb1;
        Output.points[0][1] -= ld4;
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
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought90.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = !fb1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 > fd1;
    Output.points[0][2] -= fd0;
    Output.points[0][3] += fd1;
    fd0 = fd1 + fd0;

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
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    Output.points[0][4] += ad2;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    double ld2 = 632.7601293826966;
    fb0 = ld2 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fb1 = lb0 && fb0;
if(fo1 != null){
              fo1.m3(fb1, lb0, fb0, fb1);
}
            Thought lo3 = Thought62.getInstance();
            ad3 = ad4 - fd0;
            lb0 = !fb0;
}}
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
      ab1 = fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld0 = 172.55495583767583;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    double ld2 = 633.7405094120278;
    Output.points[0][5] += ld2;
    Output.points[0][6] -= ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    ab1 = !ab2;

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
    Thought lo0 = Thought17.getInstance(fd1, fd0, fd1, fd0);
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
        fd1 = fd0 + fd1;
    fb1 = !fb0;
    double ld1 = 575.229542894399;
    fb1 = ld1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    fb0 = ld1 < fd0;
    fd1 = ld1 - fd0;
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    lb2 = fd1 < ld1;

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
    if (fb1) {
        ad2 = ad3 - ad4;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fd1 = ad1 - ad2;
if(ao4 != null){
          ad3 = ao4.m3();
}
        ad4 = fd0 - fd1;
        boolean lb0 = true;
        lb0 = fb0 || fb1;
        lb0 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        double ld1 = 293.03351062500946;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        } else {
        boolean lb2 = false;
        fd0 *= -1;
        Thought lo3 = Thought52.getInstance(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    if (ab2) {
        fd0 = fd1 - fd0;
        ab3 = ab4 && fb0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        fb1 = !ab1;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao4.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
        fd0 *= -1;
        fb0 = fd1 > fd0;
        fd1 = fd0 + fd1;
        Thought lo0 = Thought60.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
        ab4 = fd0 < fd1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          ab3 = ao3.m2(fd0, fd1, fd0, fd1);
}
        ab4 = fb0 || fb1;
        fd0 = fd1 - fd0;
        Thought lo1 = Thought24.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    double ld0 = 705.1393281292134;
    double ld1 = 745.5952434811296;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 *= -1;
    ab2 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 + ad3;
    double ld2 = 944.5071469657971;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, lb3, ab1);
}
    ab2 = ld0 < ld1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        double ld4 = 146.89820810553346;

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
    double ld0 = 836.1198279541258;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
        fb1 = ld0 < fd0;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
    fd1 *= -1;
    Output.points[0][7] += ld0;
    Thought lo3 = Thought84.getInstance(lb1, lb2, fb0, fb1);
if(fo0 != null){
      lb1 = fo0.m2();
}
    lb2 = fb0 || fb1;

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[0][8] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[1][0] -= fd0;
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought3.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    lb2 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb2, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo3 = Thought56.getInstance();
    fd1 *= -1;
    lb2 = fb0 || fb1;

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
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Output.points[1][1] += fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[1][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[1][3] -= fd0;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb0);
}
    Output.points[1][4] -= fd1;
    Output.points[1][5] -= fd0;

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
